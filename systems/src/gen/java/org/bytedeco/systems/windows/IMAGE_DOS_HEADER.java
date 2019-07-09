// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
                   // 16 bit headers are 2 byte packed

// #else
// #endif

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_DOS_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_DOS_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_DOS_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_DOS_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_DOS_HEADER position(long position) {
        return (IMAGE_DOS_HEADER)super.position(position);
    }
      // DOS .EXE header
    public native @Cast("WORD") short e_magic(); public native IMAGE_DOS_HEADER e_magic(short setter);                     // Magic number
    public native @Cast("WORD") short e_cblp(); public native IMAGE_DOS_HEADER e_cblp(short setter);                      // Bytes on last page of file
    public native @Cast("WORD") short e_cp(); public native IMAGE_DOS_HEADER e_cp(short setter);                        // Pages in file
    public native @Cast("WORD") short e_crlc(); public native IMAGE_DOS_HEADER e_crlc(short setter);                      // Relocations
    public native @Cast("WORD") short e_cparhdr(); public native IMAGE_DOS_HEADER e_cparhdr(short setter);                   // Size of header in paragraphs
    public native @Cast("WORD") short e_minalloc(); public native IMAGE_DOS_HEADER e_minalloc(short setter);                  // Minimum extra paragraphs needed
    public native @Cast("WORD") short e_maxalloc(); public native IMAGE_DOS_HEADER e_maxalloc(short setter);                  // Maximum extra paragraphs needed
    public native @Cast("WORD") short e_ss(); public native IMAGE_DOS_HEADER e_ss(short setter);                        // Initial (relative) SS value
    public native @Cast("WORD") short e_sp(); public native IMAGE_DOS_HEADER e_sp(short setter);                        // Initial SP value
    public native @Cast("WORD") short e_csum(); public native IMAGE_DOS_HEADER e_csum(short setter);                      // Checksum
    public native @Cast("WORD") short e_ip(); public native IMAGE_DOS_HEADER e_ip(short setter);                        // Initial IP value
    public native @Cast("WORD") short e_cs(); public native IMAGE_DOS_HEADER e_cs(short setter);                        // Initial (relative) CS value
    public native @Cast("WORD") short e_lfarlc(); public native IMAGE_DOS_HEADER e_lfarlc(short setter);                    // File address of relocation table
    public native @Cast("WORD") short e_ovno(); public native IMAGE_DOS_HEADER e_ovno(short setter);                      // Overlay number
    public native @Cast("WORD") short e_res(int i); public native IMAGE_DOS_HEADER e_res(int i, short setter);
    @MemberGetter public native @Cast("WORD*") ShortPointer e_res();                    // Reserved words
    public native @Cast("WORD") short e_oemid(); public native IMAGE_DOS_HEADER e_oemid(short setter);                     // OEM identifier (for e_oeminfo)
    public native @Cast("WORD") short e_oeminfo(); public native IMAGE_DOS_HEADER e_oeminfo(short setter);                   // OEM information; e_oemid specific
    public native @Cast("WORD") short e_res2(int i); public native IMAGE_DOS_HEADER e_res2(int i, short setter);
    @MemberGetter public native @Cast("WORD*") ShortPointer e_res2();                  // Reserved words
    public native @Cast("LONG") int e_lfanew(); public native IMAGE_DOS_HEADER e_lfanew(int setter);                    // File address of new exe header
  }
