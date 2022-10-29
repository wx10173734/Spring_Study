package com.lzc.bean;

import java.util.Arrays;

/**
 * @title: QianDaYe
 * @Author luozouchen
 * @Date: 2022/10/30 5:32
 */
public class QianDaYe {
    private String[] hobby;

    //多个女性朋友
    private Woman[] womens;

    public void setWomens(Woman[] womens) {
        this.womens = womens;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "QianDaYe{" +
                "hobby=" + Arrays.toString(hobby) +
                ", womens=" + Arrays.toString(womens) +
                '}';
    }
}
