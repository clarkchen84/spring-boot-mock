package sizhe.chen.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 使用Profile的形式进行条件注入，java 7 使用for循环进行计算
 *
 * @Author chensizhe
 * @Date 2022/9/6 4:48 PM
 */
@Service
@Profile("JAVA7")
public class ProfileJava7CalculateService  implements ProfileCalculateService {
    @Override
    public int sum(int... value) {
        System.out.print("java7 ");
        int sum = 0;
        for(int i = 0; i < value.length; i++){
            sum += value[i];
        }

        return sum;
    }
}
