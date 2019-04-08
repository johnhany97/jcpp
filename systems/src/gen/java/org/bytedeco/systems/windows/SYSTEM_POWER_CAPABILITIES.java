// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_POWER_CAPABILITIES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_POWER_CAPABILITIES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_POWER_CAPABILITIES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_POWER_CAPABILITIES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_POWER_CAPABILITIES position(long position) {
        return (SYSTEM_POWER_CAPABILITIES)super.position(position);
    }

    // Misc supported system features
    public native @Cast("BOOLEAN") boolean PowerButtonPresent(); public native SYSTEM_POWER_CAPABILITIES PowerButtonPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean SleepButtonPresent(); public native SYSTEM_POWER_CAPABILITIES SleepButtonPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean LidPresent(); public native SYSTEM_POWER_CAPABILITIES LidPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean SystemS1(); public native SYSTEM_POWER_CAPABILITIES SystemS1(boolean setter);
    public native @Cast("BOOLEAN") boolean SystemS2(); public native SYSTEM_POWER_CAPABILITIES SystemS2(boolean setter);
    public native @Cast("BOOLEAN") boolean SystemS3(); public native SYSTEM_POWER_CAPABILITIES SystemS3(boolean setter);
    public native @Cast("BOOLEAN") boolean SystemS4(); public native SYSTEM_POWER_CAPABILITIES SystemS4(boolean setter);           // hibernate
    public native @Cast("BOOLEAN") boolean SystemS5(); public native SYSTEM_POWER_CAPABILITIES SystemS5(boolean setter);           // off
    public native @Cast("BOOLEAN") boolean HiberFilePresent(); public native SYSTEM_POWER_CAPABILITIES HiberFilePresent(boolean setter);
    public native @Cast("BOOLEAN") boolean FullWake(); public native SYSTEM_POWER_CAPABILITIES FullWake(boolean setter);
    public native @Cast("BOOLEAN") boolean VideoDimPresent(); public native SYSTEM_POWER_CAPABILITIES VideoDimPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean ApmPresent(); public native SYSTEM_POWER_CAPABILITIES ApmPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean UpsPresent(); public native SYSTEM_POWER_CAPABILITIES UpsPresent(boolean setter);

    // Processors
    public native @Cast("BOOLEAN") boolean ThermalControl(); public native SYSTEM_POWER_CAPABILITIES ThermalControl(boolean setter);
    public native @Cast("BOOLEAN") boolean ProcessorThrottle(); public native SYSTEM_POWER_CAPABILITIES ProcessorThrottle(boolean setter);
    public native @Cast("BYTE") byte ProcessorMinThrottle(); public native SYSTEM_POWER_CAPABILITIES ProcessorMinThrottle(byte setter);

// #if (NTDDI_VERSION < NTDDI_WINXP)
// #else
    public native @Cast("BYTE") byte ProcessorMaxThrottle(); public native SYSTEM_POWER_CAPABILITIES ProcessorMaxThrottle(byte setter);
    public native @Cast("BOOLEAN") boolean FastSystemS4(); public native SYSTEM_POWER_CAPABILITIES FastSystemS4(boolean setter);
    public native @Cast("BOOLEAN") boolean Hiberboot(); public native SYSTEM_POWER_CAPABILITIES Hiberboot(boolean setter);
    public native @Cast("BOOLEAN") boolean WakeAlarmPresent(); public native SYSTEM_POWER_CAPABILITIES WakeAlarmPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean AoAc(); public native SYSTEM_POWER_CAPABILITIES AoAc(boolean setter);
// #endif // (NTDDI_VERSION < NTDDI_WINXP)

    // Disk
    public native @Cast("BOOLEAN") boolean DiskSpinDown(); public native SYSTEM_POWER_CAPABILITIES DiskSpinDown(boolean setter);
    public native @Cast("BYTE") byte spare3(int i); public native SYSTEM_POWER_CAPABILITIES spare3(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer spare3();

    // System Battery
    public native @Cast("BOOLEAN") boolean SystemBatteriesPresent(); public native SYSTEM_POWER_CAPABILITIES SystemBatteriesPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean BatteriesAreShortTerm(); public native SYSTEM_POWER_CAPABILITIES BatteriesAreShortTerm(boolean setter);
    public native @ByRef BATTERY_REPORTING_SCALE BatteryScale(int i); public native SYSTEM_POWER_CAPABILITIES BatteryScale(int i, BATTERY_REPORTING_SCALE setter);
    @MemberGetter public native BATTERY_REPORTING_SCALE BatteryScale();

    // Wake
    public native @Cast("SYSTEM_POWER_STATE") int AcOnLineWake(); public native SYSTEM_POWER_CAPABILITIES AcOnLineWake(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int SoftLidWake(); public native SYSTEM_POWER_CAPABILITIES SoftLidWake(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int RtcWake(); public native SYSTEM_POWER_CAPABILITIES RtcWake(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int MinDeviceWakeState(); public native SYSTEM_POWER_CAPABILITIES MinDeviceWakeState(int setter); // note this may change on driver load
    public native @Cast("SYSTEM_POWER_STATE") int DefaultLowLatencyWake(); public native SYSTEM_POWER_CAPABILITIES DefaultLowLatencyWake(int setter);
}
