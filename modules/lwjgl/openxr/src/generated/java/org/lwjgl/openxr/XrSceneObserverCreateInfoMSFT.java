/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The information to create a scene observer handle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneObserverCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTSceneUnderstanding#xrCreateSceneObserverMSFT CreateSceneObserverMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneObserverCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrSceneObserverCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSceneObserverCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneObserverCreateInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneObserverCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneObserverCreateInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneObserverCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneObserverCreateInfoMSFT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneObserverCreateInfoMSFT set(XrSceneObserverCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneObserverCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneObserverCreateInfoMSFT malloc() {
        return wrap(XrSceneObserverCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneObserverCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneObserverCreateInfoMSFT calloc() {
        return wrap(XrSceneObserverCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneObserverCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneObserverCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneObserverCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneObserverCreateInfoMSFT} instance for the specified memory address. */
    public static XrSceneObserverCreateInfoMSFT create(long address) {
        return wrap(XrSceneObserverCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneObserverCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneObserverCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneObserverCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneObserverCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneObserverCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneObserverCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneObserverCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code XrSceneObserverCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneObserverCreateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneObserverCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneObserverCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneObserverCreateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneObserverCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneObserverCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneObserverCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneObserverCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneObserverCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneObserverCreateInfoMSFT.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneObserverCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneObserverCreateInfoMSFT.NEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSceneObserverCreateInfoMSFT.NEXT));
    }

    // -----------------------------------

    /** An array of {@link XrSceneObserverCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneObserverCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneObserverCreateInfoMSFT ELEMENT_FACTORY = XrSceneObserverCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneObserverCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneObserverCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrSceneObserverCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneObserverCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneObserverCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneObserverCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneObserverCreateInfoMSFT.nnext(address()); }

        /** Sets the specified value to the {@link XrSceneObserverCreateInfoMSFT#type} field. */
        public XrSceneObserverCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneObserverCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT} value to the {@link XrSceneObserverCreateInfoMSFT#type} field. */
        public XrSceneObserverCreateInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneObserverCreateInfoMSFT#next} field. */
        public XrSceneObserverCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneObserverCreateInfoMSFT.nnext(address(), value); return this; }

    }

}