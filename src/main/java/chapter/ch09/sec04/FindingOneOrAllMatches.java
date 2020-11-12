package chapter.ch09.sec04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 找到一个或全部匹配
 *
 */
public class FindingOneOrAllMatches {
    public static void main(String[] args) {
        // 匹配带有正负的整数
        String regex = "[+-]?\\d+";
        //定义一个只读序列的char
        CharSequence input = "-123";
        //静态方法matches 匹配返回一个boolean值
        if (Pattern.matches(regex, input)) 
            System.out.println(input + " is an integer");
        
        //拆分代码可多次使用
        Pattern pattern = Pattern.compile(regex);
        input = "Fred";
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches())  
            System.out.println(input + " is not an integer");
        //使用流 filter 过滤的谓词(asPredicate利用正则创建谓词)
        Stream<String> strings = Stream.of("99 bottles of beer on the wall, 99 bottles of beer.".split(" "));
        Stream<String> result = strings.filter(pattern.asPredicate());
        //将流转换成集合输出
        System.out.println(result.collect(Collectors.toList()));
        //输出所有的数字字符
        input = "June 14, 1903";
        matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();            
            System.out.println(match);        
        }
    }
}
