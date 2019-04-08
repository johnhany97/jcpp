// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPluginV2Layer
 * 
 *  \brief Layer type for pluginV2
 * 
 *  @see IPluginV2
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginV2Layer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV2Layer(Pointer p) { super(p); }

    /**
     *  \brief Get the plugin for the layer.
     * 
     *  @see IPluginV2
     *  */
    public native @ByRef IPluginV2 getPlugin();
}
