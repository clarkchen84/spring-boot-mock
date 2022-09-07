package sizhe.chen.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * 使用Profile的形式进行条件注入，java 8 使用lamda进行计算、
 *
 * @Author chensizhe
 * @Date 2022/9/6 4:49 PM
 */
@Service
@Profile("JAVA8")
public class ProfileJava8CalculateService implements ProfileCalculateService {
    @Override
    public int sum(int... value) {
        System.out.print("java8 ");

        return Arrays.stream(value).sum();
    }
}
