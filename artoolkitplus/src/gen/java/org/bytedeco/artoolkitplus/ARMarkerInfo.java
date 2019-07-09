// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARMarkerInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMarkerInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARMarkerInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMarkerInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARMarkerInfo position(long position) {
        return (ARMarkerInfo)super.position(position);
    }

    public native int area(); public native ARMarkerInfo area(int setter);
    public native int id(); public native ARMarkerInfo id(int setter);
    public native int dir(); public native ARMarkerInfo dir(int setter);
    public native @Cast("ARFloat") float cf(); public native ARMarkerInfo cf(float setter);
    public native @Cast("ARFloat") float pos(int i); public native ARMarkerInfo pos(int i, float setter);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer pos();
    public native @Cast("ARFloat") float line(int i, int j); public native ARMarkerInfo line(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[4]*/ )[3]") FloatPointer line();
    public native @Cast("ARFloat") float vertex(int i, int j); public native ARMarkerInfo vertex(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[4]*/ )[2]") FloatPointer vertex();
}
