/**
 * @Title: Utils
 * @Description:
 * @Author: hanxiangwei
 * @Email: xiangwei.han@faw-vw.com
 * @Version: V1.0.0
 * @Date: 2022/1/27
 */
package com.qiyei.android.architecture.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import java.security.MessageDigest;

public class Utils {

    public static boolean checkSignature(Context context,String packageName) {
        if (context == null || TextUtils.isEmpty(packageName)){
            return false;
        }
        PackageManager manager = context.getPackageManager();
        try {
            PackageInfo packageInfo;
            Signature[] signatures;
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.P) {

                packageInfo = manager.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES);
                SigningInfo signingInfo = packageInfo.signingInfo;
                signatures = signingInfo.getApkContentsSigners();
            } else {
                //获得包的所有内容信息类
                packageInfo = manager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES);
                signatures = packageInfo.signatures;
            }
            if (signatures == null){
                return false;
            }
            Signature sign = signatures[0];

            byte[] signByte = sign.toByteArray();
            //Log.i("getSingInfo", bytesToHexString(signByte));
            Log.i("getSingInfo MD5 hash", bytesToHexString(generateHash("MD5",signByte)));
            Log.i("getSingInfo SHA-1 hash", bytesToHexString(generateHash("SHA-1",signByte)));
            Log.i("getSingInfo SHA-256 hash", bytesToHexString(generateHash("SHA-256",signByte)));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static byte[] generateHash(String name,byte[] data) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(name);
            // 开始使用算法
            messageDigest.update(data);
            // 输出算法运算结果
            byte[] hashValue = messageDigest.digest();
            return hashValue;
        } catch (Exception e) {
            Log.e("generateHash", name + " exception:" + e.getMessage());
        }
        return null;

    }

    public static String bytesToHexString(byte[] bytes) {
        if (bytes == null) {
            return "";
        }
        StringBuilder buff = new StringBuilder();
        for (byte aByte : bytes) {
            if ((aByte & 0xff) < 16) {
                buff.append('0');
            }
            buff.append(Integer.toHexString(aByte & 0xff));
        }
        return buff.toString();
    }
}
