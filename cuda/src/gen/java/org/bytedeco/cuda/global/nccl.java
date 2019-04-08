// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.global;

import org.bytedeco.cuda.nccl.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nccl extends org.bytedeco.cuda.presets.nccl {
    static { Loader.load(); }

// Parsed from nccl.h

/*************************************************************************
 * Copyright (c) 2015-2018, NVIDIA CORPORATION. All rights reserved.
 *
 * See LICENSE.txt for license information
 ************************************************************************/

// #ifndef NCCL_H_
// #define NCCL_H_

// #include <cuda_runtime.h>
// #include <cuda_fp16.h>

public static final int NCCL_MAJOR = 2;
public static final int NCCL_MINOR = 4;
public static final int NCCL_PATCH = 2;
public static final String NCCL_SUFFIX = "";

public static final int NCCL_VERSION_CODE = 2402;
// #define NCCL_VERSION(X,Y,Z) ((X) * 1000 + (Y) * 100 + (Z))

// #ifdef __cplusplus
// Targeting ../nccl/ncclComm.java



public static final int NCCL_UNIQUE_ID_BYTES = 128;
// Targeting ../nccl/ncclUniqueId.java



/* Error type */
/** enum ncclResult_t */
public static final int ncclSuccess                 = 0,
               ncclUnhandledCudaError      = 1,
               ncclSystemError             = 2,
               ncclInternalError           = 3,
               ncclInvalidArgument         = 4,
               ncclInvalidUsage            = 5,
               ncclNumResults              = 6;

/* Return the NCCL_VERSION_CODE of the NCCL library in the supplied integer.
 * This integer is coded with the MAJOR, MINOR and PATCH level of the
 * NCCL library
 */
public static native @Cast("ncclResult_t") int ncclGetVersion(IntPointer version);
public static native @Cast("ncclResult_t") int ncclGetVersion(IntBuffer version);
public static native @Cast("ncclResult_t") int ncclGetVersion(int[] version);
public static native @Cast("ncclResult_t") int pncclGetVersion(IntPointer version);
public static native @Cast("ncclResult_t") int pncclGetVersion(IntBuffer version);
public static native @Cast("ncclResult_t") int pncclGetVersion(int[] version);

/* Generates an Id to be used in ncclCommInitRank. ncclGetUniqueId should be
 * called once and the Id should be distributed to all ranks in the
 * communicator before calling ncclCommInitRank. */
public static native @Cast("ncclResult_t") int ncclGetUniqueId(ncclUniqueId uniqueId);
public static native @Cast("ncclResult_t") int pncclGetUniqueId(ncclUniqueId uniqueId);

/* Creates a new communicator (multi thread/process version).
 * rank must be between 0 and nranks-1 and unique within a communicator clique.
 * Each rank is associated to a CUDA device, which has to be set before calling
 * ncclCommInitRank.
 * ncclCommInitRank implicitly syncronizes with other ranks, so it must be
 * called by different threads/processes or use ncclGroupStart/ncclGroupEnd. */
public static native @Cast("ncclResult_t") int ncclCommInitRank(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int ncclCommInitRank(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int pncclCommInitRank(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int pncclCommInitRank(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank);

/* Creates a clique of communicators (single process version).
 * This is a convenience function to create a single-process communicator clique.
 * Returns an array of ndev newly initialized communicators in comm.
 * comm should be pre-allocated with size at least ndev*sizeof(ncclComm_t).
 * If devlist is NULL, the first ndev CUDA devices are used.
 * Order of devlist defines user-order of processors within the communicator. */
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const int[] devlist);

/* Frees resources associated with communicator object, but waits for any operations
 * that might still be running on the device. */
public static native @Cast("ncclResult_t") int ncclCommDestroy(ncclComm comm);
public static native @Cast("ncclResult_t") int pncclCommDestroy(ncclComm comm);

/* Frees resources associated with communicator object and aborts any operations
 * that might still be running on the device. */
public static native @Cast("ncclResult_t") int ncclCommAbort(ncclComm comm);
public static native @Cast("ncclResult_t") int pncclCommAbort(ncclComm comm);

/* Returns a human-readable error message. */
public static native @Cast("const char*") BytePointer ncclGetErrorString(@Cast("ncclResult_t") int result);
public static native @Cast("const char*") BytePointer pncclGetErrorString(@Cast("ncclResult_t") int result);

/* Checks whether the comm has encountered any asynchronous errors */
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntPointer asyncError);
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntBuffer asyncError);
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") int[] asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntPointer asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntBuffer asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") int[] asyncError);

/* Gets the number of ranks in the communicator clique. */
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, IntPointer count);
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, IntBuffer count);
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, int[] count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, IntPointer count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, IntBuffer count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, int[] count);

/* Returns the cuda device number associated with the communicator. */
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, IntPointer device);
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, IntBuffer device);
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, int[] device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, IntPointer device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, IntBuffer device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, int[] device);

/* Returns the user-ordered "rank" associated with the communicator. */
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, IntPointer rank);
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, IntBuffer rank);
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, int[] rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, IntPointer rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, IntBuffer rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, int[] rank);

/* Reduction operation selector */
/** enum ncclRedOp_t */
public static final int ncclSum        = 0,
               ncclProd       = 1,
               ncclMax        = 2,
               ncclMin        = 3,
               ncclNumOps     = 4;

/* Data types */
/** enum ncclDataType_t */
public static final int ncclInt8       = 0, ncclChar       = 0,
               ncclUint8      = 1,
               ncclInt32      = 2, ncclInt        = 2,
               ncclUint32     = 3,
               ncclInt64      = 4,
               ncclUint64     = 5,
               ncclFloat16    = 6, ncclHalf       = 6,
               ncclFloat32    = 7, ncclFloat      = 7,
               ncclFloat64    = 8, ncclDouble     = 8,
               ncclNumTypes   = 9;

/*
 * Collective communication operations
 *
 * Collective communication operations must be called separately for each
 * communicator in a communicator clique.
 *
 * They return when operations have been enqueued on the CUDA stream.
 *
 * Since they may perform inter-CPU synchronization, each call has to be done
 * from a different thread or process, or need to use Group Semantics (see
 * below).
 */

/*
 * Reduce
 *
 * Reduces data arrays of length count in sendbuff into recvbuff using op
 * operation.
 * recvbuff may be NULL on all calls except for root device.
 * root is the rank (not the CUDA device) where data will reside after the
 * operation is complete.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype,
    @Cast("ncclRedOp_t") int op, int root, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype,
    @Cast("ncclRedOp_t") int op, int root, ncclComm comm, CUstream_st stream);

/*
 * (deprecated) Broadcast (in-place)
 *
 * Copies count values from root to all other devices.
 * root is the rank (not the CUDA device) where data resides before the
 * operation is started.
 *
 * This operation is implicitely in place.
 */
public static native @Cast("ncclResult_t") int ncclBcast(Pointer buff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclBcast(Pointer buff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);

/*
 * Broadcast
 *
 * Copies count values from root to all other devices.
 * root is the rank (not the CUDA device) where data resides before the
 * operation is started.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclBroadcast(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclBroadcast(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);

/*
 * All-Reduce
 *
 * Reduces data arrays of length count in sendbuff using op operation, and
 * leaves identical copies of result on each recvbuff.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclAllReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count,
    @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclAllReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count,
    @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm, CUstream_st stream);

/*
 * Reduce-Scatter
 *
 * Reduces data in sendbuff using op operation and leaves reduced result
 * scattered over the devices so that recvbuff on rank i will contain the i-th
 * block of the result.
 * Assumes sendcount is equal to nranks*recvcount, which means that sendbuff
 * should have a size of at least nranks*recvcount elements.
 *
 * In-place operations will happen if recvbuff == sendbuff + rank * recvcount.
 */
public static native @Cast("ncclResult_t") int ncclReduceScatter(@Const Pointer sendbuff, Pointer recvbuff,
    @Cast("size_t") long recvcount, @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm,
    CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclReduceScatter(@Const Pointer sendbuff, Pointer recvbuff,
    @Cast("size_t") long recvcount, @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm,
    CUstream_st stream);

/*
 * All-Gather
 *
 * Each device gathers sendcount values from other GPUs into recvbuff,
 * receiving data from rank i at offset i*sendcount.
 * Assumes recvcount is equal to nranks*sendcount, which means that recvbuff
 * should have a size of at least nranks*sendcount elements.
 *
 * In-place operations will happen if sendbuff == recvbuff + rank * sendcount.
 */
public static native @Cast("ncclResult_t") int ncclAllGather(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long sendcount,
    @Cast("ncclDataType_t") int datatype, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclAllGather(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long sendcount,
    @Cast("ncclDataType_t") int datatype, ncclComm comm, CUstream_st stream);

/*
 * Group semantics
 *
 * When managing multiple GPUs from a single thread, and since NCCL collective
 * calls may perform inter-CPU synchronization, we need to "group" calls for
 * different ranks/devices into a single call.
 *
 * Grouping NCCL calls as being part of the same collective operation is done
 * using ncclGroupStart and ncclGroupEnd. ncclGroupStart will enqueue all
 * collective calls until the ncclGroupEnd call, which will wait for all calls
 * to be complete. Note that for collective communication, ncclGroupEnd only
 * guarantees that the operations are enqueued on the streams, not that
 * the operation is effectively done.
 *
 * Both collective communication and ncclCommInitRank can be used in conjunction
 * of ncclGroupStart/ncclGroupEnd.
 */

/*
 * Group Start
 *
 * Start a group call. All subsequent calls to NCCL may not block due to
 * inter-CPU synchronization.
 */
public static native @Cast("ncclResult_t") int ncclGroupStart();

/*
 * Group End
 *
 * End a group call. Wait for all calls since ncclGroupStart to complete
 * before returning.
 */
public static native @Cast("ncclResult_t") int ncclGroupEnd();

// #ifdef __cplusplus // end extern "C"
// #endif

// #endif // end include guard


}
