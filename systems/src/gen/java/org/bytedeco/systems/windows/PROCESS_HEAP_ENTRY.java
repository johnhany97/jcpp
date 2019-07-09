// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_HEAP_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_HEAP_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_HEAP_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_HEAP_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_HEAP_ENTRY position(long position) {
        return (PROCESS_HEAP_ENTRY)super.position(position);
    }

    public native @Cast("PVOID") Pointer lpData(); public native PROCESS_HEAP_ENTRY lpData(Pointer setter);
    public native @Cast("DWORD") int cbData(); public native PROCESS_HEAP_ENTRY cbData(int setter);
    public native @Cast("BYTE") byte cbOverhead(); public native PROCESS_HEAP_ENTRY cbOverhead(byte setter);
    public native @Cast("BYTE") byte iRegionIndex(); public native PROCESS_HEAP_ENTRY iRegionIndex(byte setter);
    public native @Cast("WORD") short wFlags(); public native PROCESS_HEAP_ENTRY wFlags(short setter);
            @Name("Block.hMem") public native @Cast("HANDLE") Pointer Block_hMem(); public native PROCESS_HEAP_ENTRY Block_hMem(Pointer setter);
            @Name("Block.dwReserved") public native @Cast("DWORD") int Block_dwReserved(int i); public native PROCESS_HEAP_ENTRY Block_dwReserved(int i, int setter);
            @Name("Block.dwReserved") @MemberGetter public native @Cast("DWORD*") IntPointer Block_dwReserved();
            @Name("Region.dwCommittedSize") public native @Cast("DWORD") int Region_dwCommittedSize(); public native PROCESS_HEAP_ENTRY Region_dwCommittedSize(int setter);
            @Name("Region.dwUnCommittedSize") public native @Cast("DWORD") int Region_dwUnCommittedSize(); public native PROCESS_HEAP_ENTRY Region_dwUnCommittedSize(int setter);
            @Name("Region.lpFirstBlock") public native @Cast("LPVOID") Pointer Region_lpFirstBlock(); public native PROCESS_HEAP_ENTRY Region_lpFirstBlock(Pointer setter);
            @Name("Region.lpLastBlock") public native @Cast("LPVOID") Pointer Region_lpLastBlock(); public native PROCESS_HEAP_ENTRY Region_lpLastBlock(Pointer setter); 
}
