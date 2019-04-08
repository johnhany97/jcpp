// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Name("std::vector<std::vector<std::pair<const char*,float> > >") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class StringFloatPairVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringFloatPairVectorVector(Pointer p) { super(p); }
    public StringFloatPairVectorVector(@Cast("const char*") BytePointer[][] firstValue, float[][] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringFloatPairVectorVector(String[][] firstValue, float[][] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringFloatPairVectorVector()       { allocate();  }
    public StringFloatPairVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringFloatPairVectorVector put(@ByRef StringFloatPairVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);
    public boolean empty(@Cast("size_t") long i) { return size(i) == 0; }
    public native @Index(function = "at") long size(@Cast("size_t") long i);
    public void clear(@Cast("size_t") long i) { resize(i, 0); }
    public native @Index(function = "at") void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index(value = 2, function = "at") public native @Const @Cast("const char*") BytePointer first(@Cast("size_t") long i, @Cast("size_t") long j); public native StringFloatPairVectorVector first(@Cast("size_t") long i, @Cast("size_t") long j, BytePointer first);
    @Index(value = 2, function = "at") public native float second(@Cast("size_t") long i, @Cast("size_t") long j);  public native StringFloatPairVectorVector second(@Cast("size_t") long i, @Cast("size_t") long j, float second);
    @MemberSetter @Index(function = "at") public native StringFloatPairVectorVector first(@Cast("size_t") long i, @Cast("size_t") long j, @Const String first);

    public StringFloatPairVectorVector put(@Cast("const char*") BytePointer[][] firstValue, float[][] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            for (int j = 0; j < firstValue[i].length && j < secondValue[i].length; j++) {
                first(i, j, firstValue[i][j]);
                second(i, j, secondValue[i][j]);
            }
        }
        return this;
    }

    public StringFloatPairVectorVector put(String[][] firstValue, float[][] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            for (int j = 0; j < firstValue[i].length && j < secondValue[i].length; j++) {
                first(i, j, firstValue[i][j]);
                second(i, j, secondValue[i][j]);
            }
        }
        return this;
    }
}

