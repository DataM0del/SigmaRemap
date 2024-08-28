package com.mentalfrostbyte.jello.event;

import com.mentalfrostbyte.jello.event.priority.Priority;
import com.mentalfrostbyte.jello.unmapped.Class5259;
import com.mentalfrostbyte.jello.unmapped.Class8733;
import mapped.Class8756;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class MethodWrapper {
    private static String[] field35680;
    private final Object field35681;
    private final Class<?> field35682;
    private final Method field35683;
    private final Class8733 field35684;
    private MethodHandle field35685;
    private final Priority field35686;
    private final boolean field35687;

    public MethodWrapper(Object var1, Class<?> var2, Method var3, Priority var4) {
        this.field35681 = var1;
        this.field35682 = var2;
        this.field35683 = var3;
        this.field35684 = Class8756.method31586(var3);

        try {
            this.field35685 = MethodHandles.lookup().unreflect(var3);
        } catch (IllegalAccessException var8) {
            var8.printStackTrace();
        }

        this.field35686 = var4;
        this.field35687 = var1.getClass().getSuperclass() == Class5259.class.getSuperclass();
    }

    public Object method29022() {
        return this.field35681;
    }

    public MethodHandle method29023() {
        return this.field35685;
    }

    public Class8733 method29024() {
        return this.field35684;
    }

    public Method method29025() {
        return this.field35683;
    }

    public Priority method29026() {
        return this.field35686;
    }

    public boolean method29027() {
        return this.field35687;
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof MethodWrapper)) {
            return false;
        } else {
            MethodWrapper var4 = (MethodWrapper) var1;
            return this.field35681 == var4.field35681 && this.field35683 == var4.field35683 && this.field35686 == var4.field35686;
        }
    }
}