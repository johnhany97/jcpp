// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class PPCFeatures extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPCFeatures() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPCFeatures(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPCFeatures(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPCFeatures position(long position) {
        return (PPCFeatures)super.position(position);
    }

  public native @NoOffset int ppc32(); public native PPCFeatures ppc32(int setter);
  public native @NoOffset int ppc64(); public native PPCFeatures ppc64(int setter);
  public native @NoOffset int ppc601(); public native PPCFeatures ppc601(int setter);
  public native @NoOffset int altivec(); public native PPCFeatures altivec(int setter);
  public native @NoOffset int fpu(); public native PPCFeatures fpu(int setter);
  public native @NoOffset int mmu(); public native PPCFeatures mmu(int setter);
  public native @NoOffset int mac_4xx(); public native PPCFeatures mac_4xx(int setter);
  public native @NoOffset int unifiedcache(); public native PPCFeatures unifiedcache(int setter);
  public native @NoOffset int spe(); public native PPCFeatures spe(int setter);
  public native @NoOffset int efpsingle(); public native PPCFeatures efpsingle(int setter);
  public native @NoOffset int efpdouble(); public native PPCFeatures efpdouble(int setter);
  public native @NoOffset int no_tb(); public native PPCFeatures no_tb(int setter);
  public native @NoOffset int power4(); public native PPCFeatures power4(int setter);
  public native @NoOffset int power5(); public native PPCFeatures power5(int setter);
  public native @NoOffset int power5plus(); public native PPCFeatures power5plus(int setter);
  public native @NoOffset int cell(); public native PPCFeatures cell(int setter);
  public native @NoOffset int booke(); public native PPCFeatures booke(int setter);
  public native @NoOffset int smt(); public native PPCFeatures smt(int setter);
  public native @NoOffset int icachesnoop(); public native PPCFeatures icachesnoop(int setter);
  public native @NoOffset int arch205(); public native PPCFeatures arch205(int setter);
  public native @NoOffset int pa6t(); public native PPCFeatures pa6t(int setter);
  public native @NoOffset int dfp(); public native PPCFeatures dfp(int setter);
  public native @NoOffset int power6ext(); public native PPCFeatures power6ext(int setter);
  public native @NoOffset int arch206(); public native PPCFeatures arch206(int setter);
  public native @NoOffset int vsx(); public native PPCFeatures vsx(int setter);
  public native @NoOffset int pseries_perfmon_compat(); public native PPCFeatures pseries_perfmon_compat(int setter);
  public native @NoOffset int truele(); public native PPCFeatures truele(int setter);
  public native @NoOffset int ppcle(); public native PPCFeatures ppcle(int setter);
  public native @NoOffset int arch207(); public native PPCFeatures arch207(int setter);
  public native @NoOffset int htm(); public native PPCFeatures htm(int setter);
  public native @NoOffset int dscr(); public native PPCFeatures dscr(int setter);
  public native @NoOffset int ebb(); public native PPCFeatures ebb(int setter);
  public native @NoOffset int isel(); public native PPCFeatures isel(int setter);
  public native @NoOffset int tar(); public native PPCFeatures tar(int setter);
  public native @NoOffset int vcrypto(); public native PPCFeatures vcrypto(int setter);
  public native @NoOffset int htm_nosc(); public native PPCFeatures htm_nosc(int setter);
  public native @NoOffset int arch300(); public native PPCFeatures arch300(int setter);
  public native @NoOffset int ieee128(); public native PPCFeatures ieee128(int setter);
  public native @NoOffset int darn(); public native PPCFeatures darn(int setter);
  public native @NoOffset int scv(); public native PPCFeatures scv(int setter);
  public native @NoOffset int htm_no_suspend(); public native PPCFeatures htm_no_suspend(int setter);

  // Make sure to update PPCFeaturesEnum below if you add a field here.
}
