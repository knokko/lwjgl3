/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying fence creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Handles of type {@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT} generated by the implementation may represent either Linux Sync Files or Android Fences at the implementation's discretion. Applications <b>should</b> only use operations defined for both types of file descriptors, unless they know via means external to Vulkan the type of the file descriptor, or are prepared to deal with the system-defined operation failures resulting from using the wrong type.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceExternalFenceProperties GetPhysicalDeviceExternalFenceProperties}, {@link KHRExternalFenceCapabilities#vkGetPhysicalDeviceExternalFencePropertiesKHR GetPhysicalDeviceExternalFencePropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExternalFenceInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalFenceHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkPhysicalDeviceExternalFenceInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalFenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalFenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkExternalFenceHandleTypeFlagBits} value indicating an external fence handle type for which capabilities will be returned. */
    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExternalFenceInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExternalFenceInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkPhysicalDeviceExternalFenceInfo handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalFenceInfo set(
        int sType,
        long pNext,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalFenceInfo set(VkPhysicalDeviceExternalFenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalFenceInfo malloc() {
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalFenceInfo calloc() {
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalFenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalFenceInfo create(long address) {
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalFenceInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExternalFenceInfo.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalFenceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceExternalFenceInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceExternalFenceInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalFenceInfo mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalFenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalFenceInfo callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalFenceInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFenceInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalFenceInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalFenceInfo.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalFenceInfo.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalFenceInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalFenceInfo.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalFenceInfo.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalFenceInfo} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalFenceInfo, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExternalFenceInfo ELEMENT_FACTORY = VkPhysicalDeviceExternalFenceInfo.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalFenceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalFenceInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExternalFenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExternalFenceInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalFenceInfo.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalFenceInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceExternalFenceInfo.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalFenceInfo#handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() { return VkPhysicalDeviceExternalFenceInfo.nhandleType(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceExternalFenceInfo#sType} field. */
        public VkPhysicalDeviceExternalFenceInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalFenceInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalFenceInfo#pNext} field. */
        public VkPhysicalDeviceExternalFenceInfo.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceExternalFenceInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalFenceInfo#handleType} field. */
        public VkPhysicalDeviceExternalFenceInfo.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { VkPhysicalDeviceExternalFenceInfo.nhandleType(address(), value); return this; }

    }

}