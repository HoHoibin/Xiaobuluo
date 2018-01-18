package com.xiaobuluo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class Utils {
    public static String diffTimeFromNow(Date d1)
    {
        Date now = new Date();
        String interval = "";
        long l=now.getTime()-d1.getTime();
        long day=l/(24*60*60*1000);
        long hour=(l/(60*60*1000)-day*24);
        long min=((l/(60*1000))-day*24*60-hour*60);
        long s=(l/1000-day*24*60*60-hour*60*60-min*60);
        if(day!=0)
        {
            interval += day + "天";
        }
        if(hour!=0)
        {
            interval += hour + "小时";
        }
        if(min!=0)
        {
            interval += min + "分";
        }
        if(s!=0)
        {
            interval += s + "秒";
        }
        return interval;
    }


    public static String toMD5(String data) {
        if (data == null)
            return null;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 加密转换
            md.update(data.getBytes());
            String result = new BigInteger(1, md.digest()).toString(16);

            return result;

        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
