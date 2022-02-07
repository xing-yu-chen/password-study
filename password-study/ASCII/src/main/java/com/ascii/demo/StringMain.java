package com.ascii.demo;

/**
 * @Author: xing-yu-chen
 * @Project: password-study
 * @Description: 2.字符串转换成ASCII码
 * @Data:Created in 2022/2/7 3:22 下午
 */
public class StringMain {
    public static void main(String[] args) {
        //定义字符串
        String a = "AaZ";
        //需要拆开字符串
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            int asciiCode = aChar;
            //打印单个字符，在ASCII当中十进制的数字对应是多少
            System.out.println(asciiCode);
        }
    }
}
