// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ICudaEngine
 * 
 *  \brief An engine for executing inference on a built network.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ICudaEngine extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ICudaEngine(Pointer p) { super(p); }

    /**
     *  \brief Get the number of binding indices.
     * 
     *  @see getBindingIndex();
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native int getNbBindings();

    /**
     *  \brief Retrieve the binding index for a named tensor.
     * 
     *  IExecutionContext::enqueue() and IExecutionContext::execute() require an array of buffers.
     * 
     *  Engine bindings map from tensor names to indices in this array.
     *  Binding indices are assigned at engine build time, and take values in the range [0 ... n-1] where n is the total number of inputs and outputs.
     * 
     *  @param name The tensor name.
     *  @return The binding index for the named tensor, or -1 if the name is not found.
     * 
     *  see getNbBindings() getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native int getBindingIndex(String name);
    public native int getBindingIndex(@Cast("const char*") BytePointer name);

    /**
     *  \brief Retrieve the name corresponding to a binding index.
     * 
     *  This is the reverse mapping to that provided by getBindingIndex().
     * 
     *  @param bindingIndex The binding index.
     *  @return The name corresponding to the index, or nullptr if the index is out of range.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native String getBindingName(int bindingIndex);

    /**
     *  \brief Determine whether a binding is an input binding.
     * 
     *  @param bindingIndex The binding index.
     *  @return True if the index corresponds to an input binding and the index is in range.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean bindingIsInput(int bindingIndex);

    /**
     *  \brief Get the dimensions of a binding.
     * 
     *  @param bindingIndex The binding index.
     *  @return The dimensions of the binding if the index is in range, otherwise (0,0,0).
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal Dims getBindingDimensions(int bindingIndex);

    /**
     *  \brief Determine the required data type for a buffer from its binding index.
     * 
     *  @param bindingIndex The binding index.
     *  @return The type of the data in the buffer.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    public native DataType getBindingDataType(int bindingIndex);

    /**
     *  \brief Get the maximum batch size which can be used for inference.
     * 
     *  @return The maximum batch size for this engine.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getMaxBatchSize();

    /**
     *  \brief Get the number of layers in the network.
     * 
     *  The number of layers in the network is not necessarily the number in the original network definition, as layers may be combined or eliminated as the engine is
     *  optimized. This value can be useful when building per-layer tables, such as when aggregating profiling data over a number of executions.
     * 
     *  @return The number of layers in the network.
     *  */
    
    
    //!
    //!
    //!
    public native int getNbLayers();

    /**
     *  \brief Get the amount of workspace the engine uses.
     * 
     *  The workspace size will be no greater than the value provided to the builder when the engine was built, and will typically be smaller.
     *  Workspace will be allocated for each execution context.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("std::size_t") long getWorkspaceSize();

    /**
     *  \brief Serialize the network to a stream.
     * 
     *  @return A IHostMemory object that contains the serialized engine.
     * 
     *  The network may be deserialized with IRuntime::deserializeCudaEngine()
     * 
     *  @see IRuntime::deserializeCudaEngine()
     *  */
    
    
    //!
    //!
    //!
    public native IHostMemory serialize();

    /**
     *  \brief Create an execution context.
     * 
     *  @see IExecutionContext.
     *  */
    
    
    //!
    //!
    public native IExecutionContext createExecutionContext();

    /**
     *  \brief Destroy this object;
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void destroy();

    /**
     *  \brief Get location of binding
     * 
     *  This lets you know whether the binding should be a pointer to device or host memory.
     * 
     *  @see ITensor::setLocation() ITensor::getLocation()
     * 
     *  @param bindingIndex The binding index.
     *  @return The location of the bound tensor with given index.
     *  */
    public native TensorLocation getLocation(int bindingIndex);
    /**
     *  \brief create an execution context without any device memory allocated
     * 
     *  The memory for execution of this device context must be supplied by the application.
     * 
     *  @see getDeviceMemorySize() IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native IExecutionContext createExecutionContextWithoutDeviceMemory();

    /**
     *  \brief Return the amount of device memory required by an execution context.
     * 
     *  @see IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("size_t") long getDeviceMemorySize();

    /**
     *  \brief Return true if engine can be refit.
     * 
     *  @see nvinfer1::createInferRefitter()
     *  */
    public native @Cast("bool") boolean isRefittable();
}
