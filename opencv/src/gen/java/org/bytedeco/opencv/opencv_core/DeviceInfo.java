// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Class providing functionality for querying the specified GPU properties.
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class DeviceInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DeviceInfo position(long position) {
        return (DeviceInfo)super.position(position);
    }

    /** creates DeviceInfo object for the current GPU */
    public DeviceInfo() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief The constructors.
    <p>
    @param device_id System index of the CUDA device starting with 0.
    <p>
    Constructs the DeviceInfo object for the specified device. If device_id parameter is missed, it
    constructs an object for the current device.
     */
    public DeviceInfo(int device_id) { super((Pointer)null); allocate(device_id); }
    private native void allocate(int device_id);

    /** \brief Returns system index of the CUDA device starting with 0.
    */
    public native int deviceID();

    /** ASCII string identifying device */
    public native @Cast("const char*") BytePointer name();

    /** global memory available on device in bytes */
    public native @Cast("size_t") long totalGlobalMem();

    /** shared memory available per block in bytes */
    public native @Cast("size_t") long sharedMemPerBlock();

    /** 32-bit registers available per block */
    public native int regsPerBlock();

    /** warp size in threads */
    public native int warpSize();

    /** maximum pitch in bytes allowed by memory copies */
    public native @Cast("size_t") long memPitch();

    /** maximum number of threads per block */
    public native int maxThreadsPerBlock();

    /** maximum size of each dimension of a block */
    public native @ByVal Point3i maxThreadsDim();

    /** maximum size of each dimension of a grid */
    public native @ByVal Point3i maxGridSize();

    /** clock frequency in kilohertz */
    public native int clockRate();

    /** constant memory available on device in bytes */
    public native @Cast("size_t") long totalConstMem();

    /** major compute capability */
    public native int majorVersion();

    /** minor compute capability */
    public native int minorVersion();

    /** alignment requirement for textures */
    public native @Cast("size_t") long textureAlignment();

    /** pitch alignment requirement for texture references bound to pitched memory */
    public native @Cast("size_t") long texturePitchAlignment();

    /** number of multiprocessors on device */
    public native int multiProcessorCount();

    /** specified whether there is a run time limit on kernels */
    public native @Cast("bool") boolean kernelExecTimeoutEnabled();

    /** device is integrated as opposed to discrete */
    public native @Cast("bool") boolean integrated();

    /** device can map host memory with cudaHostAlloc/cudaHostGetDevicePointer */
    public native @Cast("bool") boolean canMapHostMemory();

    /** enum cv::cuda::DeviceInfo::ComputeMode */
    public static final int
        /** default compute mode (Multiple threads can use cudaSetDevice with this device) */
        ComputeModeDefault = 0,
        /** compute-exclusive-thread mode (Only one thread in one process will be able to use cudaSetDevice with this device) */
        ComputeModeExclusive = 1,
        /** compute-prohibited mode (No threads can use cudaSetDevice with this device) */
        ComputeModeProhibited = 2,
        /** compute-exclusive-process mode (Many threads in one process will be able to use cudaSetDevice with this device) */
        ComputeModeExclusiveProcess = 3;

    /** compute mode */
    public native @Cast("cv::cuda::DeviceInfo::ComputeMode") int computeMode();

    /** maximum 1D texture size */
    public native int maxTexture1D();

    /** maximum 1D mipmapped texture size */
    public native int maxTexture1DMipmap();

    /** maximum size for 1D textures bound to linear memory */
    public native int maxTexture1DLinear();

    /** maximum 2D texture dimensions */
    public native @ByVal Point maxTexture2D();

    /** maximum 2D mipmapped texture dimensions */
    public native @ByVal Point maxTexture2DMipmap();

    /** maximum dimensions (width, height, pitch) for 2D textures bound to pitched memory */
    public native @ByVal Point3i maxTexture2DLinear();

    /** maximum 2D texture dimensions if texture gather operations have to be performed */
    public native @ByVal Point maxTexture2DGather();

    /** maximum 3D texture dimensions */
    public native @ByVal Point3i maxTexture3D();

    /** maximum Cubemap texture dimensions */
    public native int maxTextureCubemap();

    /** maximum 1D layered texture dimensions */
    public native @ByVal Point maxTexture1DLayered();

    /** maximum 2D layered texture dimensions */
    public native @ByVal Point3i maxTexture2DLayered();

    /** maximum Cubemap layered texture dimensions */
    public native @ByVal Point maxTextureCubemapLayered();

    /** maximum 1D surface size */
    public native int maxSurface1D();

    /** maximum 2D surface dimensions */
    public native @ByVal Point maxSurface2D();

    /** maximum 3D surface dimensions */
    public native @ByVal Point3i maxSurface3D();

    /** maximum 1D layered surface dimensions */
    public native @ByVal Point maxSurface1DLayered();

    /** maximum 2D layered surface dimensions */
    public native @ByVal Point3i maxSurface2DLayered();

    /** maximum Cubemap surface dimensions */
    public native int maxSurfaceCubemap();

    /** maximum Cubemap layered surface dimensions */
    public native @ByVal Point maxSurfaceCubemapLayered();

    /** alignment requirements for surfaces */
    public native @Cast("size_t") long surfaceAlignment();

    /** device can possibly execute multiple kernels concurrently */
    public native @Cast("bool") boolean concurrentKernels();

    /** device has ECC support enabled */
    public native @Cast("bool") boolean ECCEnabled();

    /** PCI bus ID of the device */
    public native int pciBusID();

    /** PCI device ID of the device */
    public native int pciDeviceID();

    /** PCI domain ID of the device */
    public native int pciDomainID();

    /** true if device is a Tesla device using TCC driver, false otherwise */
    public native @Cast("bool") boolean tccDriver();

    /** number of asynchronous engines */
    public native int asyncEngineCount();

    /** device shares a unified address space with the host */
    public native @Cast("bool") boolean unifiedAddressing();

    /** peak memory clock frequency in kilohertz */
    public native int memoryClockRate();

    /** global memory bus width in bits */
    public native int memoryBusWidth();

    /** size of L2 cache in bytes */
    public native int l2CacheSize();

    /** maximum resident threads per multiprocessor */
    public native int maxThreadsPerMultiProcessor();

    /** gets free and total device memory */
    public native void queryMemory(@Cast("size_t*") @ByRef SizeTPointer totalMemory, @Cast("size_t*") @ByRef SizeTPointer freeMemory);
    public native @Cast("size_t") long freeMemory();
    public native @Cast("size_t") long totalMemory();

    /** \brief Provides information on CUDA feature support.
    <p>
    @param feature_set Features to be checked. See cuda::FeatureSet.
    <p>
    This function returns true if the device has the specified CUDA feature. Otherwise, it returns false
     */
    public native @Cast("bool") boolean supports(@Cast("cv::cuda::FeatureSet") int feature_set);

    /** \brief Checks the CUDA module and device compatibility.
    <p>
    This function returns true if the CUDA module can be run on the specified device. Otherwise, it
    returns false .
     */
    public native @Cast("bool") boolean isCompatible();
}
