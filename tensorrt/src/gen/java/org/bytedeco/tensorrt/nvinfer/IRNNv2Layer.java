// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IRNNv2Layer
 * 
 *  \brief An RNN layer in a network definition, version 2.
 * 
 *  This layer supersedes IRNNLayer.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRNNv2Layer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRNNv2Layer(Pointer p) { super(p); }

    public native int getLayerCount();   //< Get the layer count of the RNN
    public native int getHiddenSize();   //< Get the hidden size of the RNN
    public native int getMaxSeqLength(); //< Get the maximum sequence length of the RNN
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native int getDataLength();   //< Get the maximum data length of the RNN

    /**
     *  \brief Specify individual sequence lengths in the batch with the ITensor pointed to by
     *  \p seqLengths.
     * 
     *  The \p seqLengths ITensor should be a {N1, ..., Np} tensor, where N1..Np are the index dimensions
     *  of the input tensor to the RNN.
     * 
     *  If this is not specified, then the RNN layer assumes all sequences are size getMaxSeqLength().
     * 
     *  All sequence lengths in \p seqLengths should be in the range [1, getMaxSeqLength()].  Zero-length
     *  sequences are not supported.
     * 
     *  This tensor must be of type DataType::kINT32.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setSequenceLengths(@ByRef ITensor seqLengths);

    /**
     *  \brief Get the sequence lengths specified for the RNN.
     * 
     *  @return nullptr if no sequence lengths were specified, the sequence length data otherwise.
     * 
     *  @see setSequenceLengths()
     *  */
    
    
    //!
    //!
    public native ITensor getSequenceLengths();

    /**
     *  \brief Set the operation of the RNN layer.
     *  @see getOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    public native void setOperation(RNNOperation op);
    public native void setOperation(@Cast("nvinfer1::RNNOperation") int op);

    /**
     *  \brief Get the operation of the RNN layer.
     *  @see setOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    public native RNNOperation getOperation();

    /**
     *  \brief Set the input mode of the RNN layer.
     *  @see getInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    public native void setInputMode(RNNInputMode op);
    public native void setInputMode(@Cast("nvinfer1::RNNInputMode") int op);

    /**
     *  \brief Get the input mode of the RNN layer.
     *  @see setInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    public native RNNInputMode getInputMode();

    /**
     *  \brief Set the direction of the RNN layer.
     *  @see getDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    public native void setDirection(RNNDirection op);
    public native void setDirection(@Cast("nvinfer1::RNNDirection") int op);

    /**
     *  \brief Get the direction of the RNN layer.
     *  @see setDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    //!
    public native RNNDirection getDirection();

    /**
     *  \brief Set the weight parameters for an individual gate in the RNN.
     * 
     *  @param layerIndex The index of the layer that contains this gate.  See the section
     *         \ref setRNNWeightsOrder "Order of weight matrices" in IRNNLayer::setWeights()
     *         for a description of the layer index.
     *  @param gate The name of the gate within the RNN layer.  The gate name must correspond
     *         to one of the gates used by this layer's #RNNOperation.
     *  @param isW True if the weight parameters are for the input matrix W[g]
     *         and false if they are for the recurrent input matrix R[g].  See
     *         #RNNOperation for equations showing how these matrices are used
     *         in the RNN gate.
     *  @param weights The weight structure holding the weight parameters, which are stored
     *         as a row-major 2D matrix.  See \ref setRNNWeightsLayout "the layout of elements within a weight matrix"
     *         in IRNNLayer::setWeights() for documentation on the expected
     *         dimensions of this matrix.
     *  */
    
    
    //!
    //!
    public native void setWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights weights);
    public native void setWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights weights);

    /**
     *  \brief Get the weight parameters for an individual gate in the RNN.
     *  @see setWeightsForGate()
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal Weights getWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal Weights getWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);

    /**
     *  \brief Set the bias parameters for an individual gate in the RNN.
     * 
     *  @param layerIndex The index of the layer that contains this gate.  See the section
     *         \ref setRNNWeightsOrder "Order of weight matrices" in IRNNLayer::setWeights()
     *         for a description of the layer index.
     *  @param gate The name of the gate within the RNN layer.  The gate name must correspond
     *         to one of the gates used by this layer's #RNNOperation.
     *  @param isW True if the bias parameters are for the input bias Wb[g]
     *         and false if they are for the recurrent input bias Rb[g].  See
     *         #RNNOperation for equations showing how these bias vectors are used
     *         in the RNN gate.
     *  @param bias The weight structure holding the bias parameters, which should be an
     *         array of size getHiddenSize().
     *  */
    
    
    //!
    //!
    public native void setBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights bias);
    public native void setBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights bias);

    /**
     *  \brief Get the bias parameters for an individual gate in the RNN.
     *  @see setBiasForGate()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal Weights getBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal Weights getBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);

    /**
     *  \brief Set the initial hidden state of the RNN with the provided \p hidden ITensor.
     * 
     *  The \p hidden ITensor should have the dimensions {@code {N1, ..., Np, L, H}}, where:
     * 
     *   - {@code N1..Np} are the index dimensions specified by the input tensor
     *   - {@code L} is the number of layers in the RNN, equal to getLayerCount() if getDirection is ::kUNIDIRECTION,
     *      and 2x getLayerCount() if getDirection is ::kBIDIRECTION. In the bi-directional
     *      case, layer {@code l}'s final forward hidden state is stored in {@code L = 2*l}, and
     *      final backward hidden state is stored in {@code L= 2*l + 1}.
     *   - {@code H} is the hidden state for each layer, equal to getHiddenSize().
     *  */
    
    
    //!
    //!
    public native void setHiddenState(@ByRef ITensor hidden);

    /**
     *  \brief Get the initial hidden state of the RNN.
     *  @see setHiddenState()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native ITensor getHiddenState();

    /**
     *  \brief Set the initial cell state of the LSTM with the provided \p cell ITensor.
     * 
     *  The \p cell ITensor should have the dimensions {@code {N1, ..., Np, L, H}}, where:
     * 
     *   - {@code N1..Np} are the index dimensions specified by the input tensor
     *   - {@code L} is the number of layers in the RNN, equal to getLayerCount() if getDirection is ::kUNIDIRECTION,
     *      and 2x getLayerCount() if getDirection is ::kBIDIRECTION. In the bi-directional
     *      case, layer {@code l}'s final forward hidden state is stored in {@code L = 2*l}, and
     *      final backward hidden state is stored in {@code L= 2*l + 1}.
     *   - {@code H} is the hidden state for each layer, equal to getHiddenSize().
     * 
     *  It is an error to call setCellState() on an RNN layer that is not configured with RNNOperation::kLSTM.
     *  */
    
    
    //!
    //!
    public native void setCellState(@ByRef ITensor cell);

    /**
     *  \brief Get the initial cell state of the RNN.
     *  @see setCellState()
     *  */
    public native ITensor getCellState();
}
