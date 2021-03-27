package org.zgx.common.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 村民方法切面
 *
 * @author zgx
 * @date 2021/03/27
 */
@Component
@Aspect
public class VillagerAspect {

    private static final Logger logger = LoggerFactory.getLogger(VillagerAspect.class);

    /**
     * 访问修饰符可不写不能用*，第一个*代表返回值类型不限，controller处也可写*代表所有controller，最后一个*代表所有方法，。。表示方法参数不限
     */
    private final String POINT_CUT = "execution(public * org.zgx.common.controller.VillagerController.*(..))";
    private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Pointcut(POINT_CUT)
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        logger.info("@Before通知开始了！");
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg -> {
            try {
                logger.info(OBJECT_MAPPER.writeValueAsString(arg));
            } catch (JsonProcessingException e) {
                logger.info(arg.toString());
            }
        });

        //aop代理对象
        Object aThis = joinPoint.getThis();
        logger.info(aThis.toString());

        //被代理对象
        Object target = joinPoint.getTarget();
        logger.info(target.toString());

        //获取连接点的方法签名对象
        Signature signature = joinPoint.getSignature();
        logger.info(signature.toLongString());
        logger.info(signature.toShortString());
        logger.info(signature.toString());
        //获取方法名
        logger.info(signature.getName());
        //获取声明类型名
        logger.info(signature.getDeclaringTypeName());
        //获取声明类型  方法所在类的class对象
        logger.info(signature.getDeclaringType().toString());
        //和getDeclaringTypeName()一样
        logger.info(signature.getDeclaringType().getName());

        //连接点类型
        String kind = joinPoint.getKind();
        logger.info(kind);

        //返回连接点方法所在类文件中的位置  打印报异常
        SourceLocation sourceLocation = joinPoint.getSourceLocation();
        logger.info(sourceLocation.toString());

        ///返回连接点静态部分
        JoinPoint.StaticPart staticPart = joinPoint.getStaticPart();
        logger.info(staticPart.toLongString());

        //attributes可以获取request信息 session信息等
        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info(request.getRequestURL().toString());
        logger.info(request.getRemoteAddr());
        logger.info(request.getMethod());

        logger.info("before通知执行结束了！");
    }
}


