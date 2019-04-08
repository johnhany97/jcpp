// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Optional header format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_OPTIONAL_HEADER32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_OPTIONAL_HEADER32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_OPTIONAL_HEADER32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_OPTIONAL_HEADER32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_OPTIONAL_HEADER32 position(long position) {
        return (IMAGE_OPTIONAL_HEADER32)super.position(position);
    }

    //
    // Standard fields.
    //

    public native @Cast("WORD") short Magic(); public native IMAGE_OPTIONAL_HEADER32 Magic(short setter);
    public native @Cast("BYTE") byte MajorLinkerVersion(); public native IMAGE_OPTIONAL_HEADER32 MajorLinkerVersion(byte setter);
    public native @Cast("BYTE") byte MinorLinkerVersion(); public native IMAGE_OPTIONAL_HEADER32 MinorLinkerVersion(byte setter);
    public native @Cast("DWORD") int SizeOfCode(); public native IMAGE_OPTIONAL_HEADER32 SizeOfCode(int setter);
    public native @Cast("DWORD") int SizeOfInitializedData(); public native IMAGE_OPTIONAL_HEADER32 SizeOfInitializedData(int setter);
    public native @Cast("DWORD") int SizeOfUninitializedData(); public native IMAGE_OPTIONAL_HEADER32 SizeOfUninitializedData(int setter);
    public native @Cast("DWORD") int AddressOfEntryPoint(); public native IMAGE_OPTIONAL_HEADER32 AddressOfEntryPoint(int setter);
    public native @Cast("DWORD") int BaseOfCode(); public native IMAGE_OPTIONAL_HEADER32 BaseOfCode(int setter);
    public native @Cast("DWORD") int BaseOfData(); public native IMAGE_OPTIONAL_HEADER32 BaseOfData(int setter);

    //
    // NT additional fields.
    //

    public native @Cast("DWORD") int ImageBase(); public native IMAGE_OPTIONAL_HEADER32 ImageBase(int setter);
    public native @Cast("DWORD") int SectionAlignment(); public native IMAGE_OPTIONAL_HEADER32 SectionAlignment(int setter);
    public native @Cast("DWORD") int FileAlignment(); public native IMAGE_OPTIONAL_HEADER32 FileAlignment(int setter);
    public native @Cast("WORD") short MajorOperatingSystemVersion(); public native IMAGE_OPTIONAL_HEADER32 MajorOperatingSystemVersion(short setter);
    public native @Cast("WORD") short MinorOperatingSystemVersion(); public native IMAGE_OPTIONAL_HEADER32 MinorOperatingSystemVersion(short setter);
    public native @Cast("WORD") short MajorImageVersion(); public native IMAGE_OPTIONAL_HEADER32 MajorImageVersion(short setter);
    public native @Cast("WORD") short MinorImageVersion(); public native IMAGE_OPTIONAL_HEADER32 MinorImageVersion(short setter);
    public native @Cast("WORD") short MajorSubsystemVersion(); public native IMAGE_OPTIONAL_HEADER32 MajorSubsystemVersion(short setter);
    public native @Cast("WORD") short MinorSubsystemVersion(); public native IMAGE_OPTIONAL_HEADER32 MinorSubsystemVersion(short setter);
    public native @Cast("DWORD") int Win32VersionValue(); public native IMAGE_OPTIONAL_HEADER32 Win32VersionValue(int setter);
    public native @Cast("DWORD") int SizeOfImage(); public native IMAGE_OPTIONAL_HEADER32 SizeOfImage(int setter);
    public native @Cast("DWORD") int SizeOfHeaders(); public native IMAGE_OPTIONAL_HEADER32 SizeOfHeaders(int setter);
    public native @Cast("DWORD") int CheckSum(); public native IMAGE_OPTIONAL_HEADER32 CheckSum(int setter);
    public native @Cast("WORD") short Subsystem(); public native IMAGE_OPTIONAL_HEADER32 Subsystem(short setter);
    public native @Cast("WORD") short DllCharacteristics(); public native IMAGE_OPTIONAL_HEADER32 DllCharacteristics(short setter);
    public native @Cast("DWORD") int SizeOfStackReserve(); public native IMAGE_OPTIONAL_HEADER32 SizeOfStackReserve(int setter);
    public native @Cast("DWORD") int SizeOfStackCommit(); public native IMAGE_OPTIONAL_HEADER32 SizeOfStackCommit(int setter);
    public native @Cast("DWORD") int SizeOfHeapReserve(); public native IMAGE_OPTIONAL_HEADER32 SizeOfHeapReserve(int setter);
    public native @Cast("DWORD") int SizeOfHeapCommit(); public native IMAGE_OPTIONAL_HEADER32 SizeOfHeapCommit(int setter);
    public native @Cast("DWORD") int LoaderFlags(); public native IMAGE_OPTIONAL_HEADER32 LoaderFlags(int setter);
    public native @Cast("DWORD") int NumberOfRvaAndSizes(); public native IMAGE_OPTIONAL_HEADER32 NumberOfRvaAndSizes(int setter);
    public native @ByRef IMAGE_DATA_DIRECTORY DataDirectory(int i); public native IMAGE_OPTIONAL_HEADER32 DataDirectory(int i, IMAGE_DATA_DIRECTORY setter);
    @MemberGetter public native IMAGE_DATA_DIRECTORY DataDirectory();
}
