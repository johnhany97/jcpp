// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class COPYFILE2_MESSAGE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public COPYFILE2_MESSAGE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public COPYFILE2_MESSAGE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public COPYFILE2_MESSAGE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public COPYFILE2_MESSAGE position(long position) {
        return (COPYFILE2_MESSAGE)super.position(position);
    }


    public native @Cast("COPYFILE2_MESSAGE_TYPE") int Type(); public native COPYFILE2_MESSAGE Type(int setter);
    public native @Cast("DWORD") int dwPadding(); public native COPYFILE2_MESSAGE dwPadding(int setter);


            @Name("Info.ChunkStarted.dwStreamNumber") public native @Cast("DWORD") int Info_ChunkStarted_dwStreamNumber(); public native COPYFILE2_MESSAGE Info_ChunkStarted_dwStreamNumber(int setter); // monotonically increasing stream number
            @Name("Info.ChunkStarted.dwReserved") public native @Cast("DWORD") int Info_ChunkStarted_dwReserved(); public native COPYFILE2_MESSAGE Info_ChunkStarted_dwReserved(int setter);
            @Name("Info.ChunkStarted.hSourceFile") public native @Cast("HANDLE") Pointer Info_ChunkStarted_hSourceFile(); public native COPYFILE2_MESSAGE Info_ChunkStarted_hSourceFile(Pointer setter); // handle to the source stream
            @Name("Info.ChunkStarted.hDestinationFile") public native @Cast("HANDLE") Pointer Info_ChunkStarted_hDestinationFile(); public native COPYFILE2_MESSAGE Info_ChunkStarted_hDestinationFile(Pointer setter); // handle to the destination stream
            @Name("Info.ChunkStarted.uliChunkNumber") public native @ByRef ULARGE_INTEGER Info_ChunkStarted_uliChunkNumber(); public native COPYFILE2_MESSAGE Info_ChunkStarted_uliChunkNumber(ULARGE_INTEGER setter); // monotonically increasing chunk number
            @Name("Info.ChunkStarted.uliChunkSize") public native @ByRef ULARGE_INTEGER Info_ChunkStarted_uliChunkSize(); public native COPYFILE2_MESSAGE Info_ChunkStarted_uliChunkSize(ULARGE_INTEGER setter);  // size of the copied chunk
            @Name("Info.ChunkStarted.uliStreamSize") public native @ByRef ULARGE_INTEGER Info_ChunkStarted_uliStreamSize(); public native COPYFILE2_MESSAGE Info_ChunkStarted_uliStreamSize(ULARGE_INTEGER setter); // size of the current stream
            @Name("Info.ChunkStarted.uliTotalFileSize") public native @ByRef ULARGE_INTEGER Info_ChunkStarted_uliTotalFileSize(); public native COPYFILE2_MESSAGE Info_ChunkStarted_uliTotalFileSize(ULARGE_INTEGER setter); // size of all streams for this file

            @Name("Info.ChunkFinished.dwStreamNumber") public native @Cast("DWORD") int Info_ChunkFinished_dwStreamNumber(); public native COPYFILE2_MESSAGE Info_ChunkFinished_dwStreamNumber(int setter); // monotonically increasing stream number
            @Name("Info.ChunkFinished.dwFlags") public native @Cast("DWORD") int Info_ChunkFinished_dwFlags(); public native COPYFILE2_MESSAGE Info_ChunkFinished_dwFlags(int setter);
            @Name("Info.ChunkFinished.hSourceFile") public native @Cast("HANDLE") Pointer Info_ChunkFinished_hSourceFile(); public native COPYFILE2_MESSAGE Info_ChunkFinished_hSourceFile(Pointer setter); // handle to the source stream
            @Name("Info.ChunkFinished.hDestinationFile") public native @Cast("HANDLE") Pointer Info_ChunkFinished_hDestinationFile(); public native COPYFILE2_MESSAGE Info_ChunkFinished_hDestinationFile(Pointer setter); // handle to the destination stream
            @Name("Info.ChunkFinished.uliChunkNumber") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliChunkNumber(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliChunkNumber(ULARGE_INTEGER setter); // monotonically increasing chunk number
            @Name("Info.ChunkFinished.uliChunkSize") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliChunkSize(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliChunkSize(ULARGE_INTEGER setter);  // size of the copied chunk
            @Name("Info.ChunkFinished.uliStreamSize") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliStreamSize(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliStreamSize(ULARGE_INTEGER setter); // size of the current stream
            @Name("Info.ChunkFinished.uliStreamBytesTransferred") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliStreamBytesTransferred(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliStreamBytesTransferred(ULARGE_INTEGER setter); // bytes copied for this stream so far
            @Name("Info.ChunkFinished.uliTotalFileSize") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliTotalFileSize(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliTotalFileSize(ULARGE_INTEGER setter); // size of all streams for this file
            @Name("Info.ChunkFinished.uliTotalBytesTransferred") public native @ByRef ULARGE_INTEGER Info_ChunkFinished_uliTotalBytesTransferred(); public native COPYFILE2_MESSAGE Info_ChunkFinished_uliTotalBytesTransferred(ULARGE_INTEGER setter); // total bytes copied so far

            @Name("Info.StreamStarted.dwStreamNumber") public native @Cast("DWORD") int Info_StreamStarted_dwStreamNumber(); public native COPYFILE2_MESSAGE Info_StreamStarted_dwStreamNumber(int setter);
            @Name("Info.StreamStarted.dwReserved") public native @Cast("DWORD") int Info_StreamStarted_dwReserved(); public native COPYFILE2_MESSAGE Info_StreamStarted_dwReserved(int setter);
            @Name("Info.StreamStarted.hSourceFile") public native @Cast("HANDLE") Pointer Info_StreamStarted_hSourceFile(); public native COPYFILE2_MESSAGE Info_StreamStarted_hSourceFile(Pointer setter); // handle to the source stream
            @Name("Info.StreamStarted.hDestinationFile") public native @Cast("HANDLE") Pointer Info_StreamStarted_hDestinationFile(); public native COPYFILE2_MESSAGE Info_StreamStarted_hDestinationFile(Pointer setter); // handle to the destination stream
            @Name("Info.StreamStarted.uliStreamSize") public native @ByRef ULARGE_INTEGER Info_StreamStarted_uliStreamSize(); public native COPYFILE2_MESSAGE Info_StreamStarted_uliStreamSize(ULARGE_INTEGER setter); // size of this stream
            @Name("Info.StreamStarted.uliTotalFileSize") public native @ByRef ULARGE_INTEGER Info_StreamStarted_uliTotalFileSize(); public native COPYFILE2_MESSAGE Info_StreamStarted_uliTotalFileSize(ULARGE_INTEGER setter); // total size of all streams for this file

            @Name("Info.StreamFinished.dwStreamNumber") public native @Cast("DWORD") int Info_StreamFinished_dwStreamNumber(); public native COPYFILE2_MESSAGE Info_StreamFinished_dwStreamNumber(int setter);
            @Name("Info.StreamFinished.dwReserved") public native @Cast("DWORD") int Info_StreamFinished_dwReserved(); public native COPYFILE2_MESSAGE Info_StreamFinished_dwReserved(int setter);
            @Name("Info.StreamFinished.hSourceFile") public native @Cast("HANDLE") Pointer Info_StreamFinished_hSourceFile(); public native COPYFILE2_MESSAGE Info_StreamFinished_hSourceFile(Pointer setter); // handle to the source stream
            @Name("Info.StreamFinished.hDestinationFile") public native @Cast("HANDLE") Pointer Info_StreamFinished_hDestinationFile(); public native COPYFILE2_MESSAGE Info_StreamFinished_hDestinationFile(Pointer setter); // handle to the destination stream
            @Name("Info.StreamFinished.uliStreamSize") public native @ByRef ULARGE_INTEGER Info_StreamFinished_uliStreamSize(); public native COPYFILE2_MESSAGE Info_StreamFinished_uliStreamSize(ULARGE_INTEGER setter);
            @Name("Info.StreamFinished.uliStreamBytesTransferred") public native @ByRef ULARGE_INTEGER Info_StreamFinished_uliStreamBytesTransferred(); public native COPYFILE2_MESSAGE Info_StreamFinished_uliStreamBytesTransferred(ULARGE_INTEGER setter);
            @Name("Info.StreamFinished.uliTotalFileSize") public native @ByRef ULARGE_INTEGER Info_StreamFinished_uliTotalFileSize(); public native COPYFILE2_MESSAGE Info_StreamFinished_uliTotalFileSize(ULARGE_INTEGER setter);
            @Name("Info.StreamFinished.uliTotalBytesTransferred") public native @ByRef ULARGE_INTEGER Info_StreamFinished_uliTotalBytesTransferred(); public native COPYFILE2_MESSAGE Info_StreamFinished_uliTotalBytesTransferred(ULARGE_INTEGER setter);

            @Name("Info.PollContinue.dwReserved") public native @Cast("DWORD") int Info_PollContinue_dwReserved(); public native COPYFILE2_MESSAGE Info_PollContinue_dwReserved(int setter);

            @Name("Info.Error.CopyPhase") public native @Cast("COPYFILE2_COPY_PHASE") int Info_Error_CopyPhase(); public native COPYFILE2_MESSAGE Info_Error_CopyPhase(int setter);
            @Name("Info.Error.dwStreamNumber") public native @Cast("DWORD") int Info_Error_dwStreamNumber(); public native COPYFILE2_MESSAGE Info_Error_dwStreamNumber(int setter);
            @Name("Info.Error.hrFailure") public native @Cast("HRESULT") int Info_Error_hrFailure(); public native COPYFILE2_MESSAGE Info_Error_hrFailure(int setter);
            @Name("Info.Error.dwReserved") public native @Cast("DWORD") int Info_Error_dwReserved(); public native COPYFILE2_MESSAGE Info_Error_dwReserved(int setter);
            @Name("Info.Error.uliChunkNumber") public native @ByRef ULARGE_INTEGER Info_Error_uliChunkNumber(); public native COPYFILE2_MESSAGE Info_Error_uliChunkNumber(ULARGE_INTEGER setter);
            @Name("Info.Error.uliStreamSize") public native @ByRef ULARGE_INTEGER Info_Error_uliStreamSize(); public native COPYFILE2_MESSAGE Info_Error_uliStreamSize(ULARGE_INTEGER setter);
            @Name("Info.Error.uliStreamBytesTransferred") public native @ByRef ULARGE_INTEGER Info_Error_uliStreamBytesTransferred(); public native COPYFILE2_MESSAGE Info_Error_uliStreamBytesTransferred(ULARGE_INTEGER setter);
            @Name("Info.Error.uliTotalFileSize") public native @ByRef ULARGE_INTEGER Info_Error_uliTotalFileSize(); public native COPYFILE2_MESSAGE Info_Error_uliTotalFileSize(ULARGE_INTEGER setter);
            @Name("Info.Error.uliTotalBytesTransferred") public native @ByRef ULARGE_INTEGER Info_Error_uliTotalBytesTransferred(); public native COPYFILE2_MESSAGE Info_Error_uliTotalBytesTransferred(ULARGE_INTEGER setter);

}
