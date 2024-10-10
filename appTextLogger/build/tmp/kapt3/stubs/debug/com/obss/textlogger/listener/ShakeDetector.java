package com.obss.textlogger.listener;

/**
 * This class is used for detecting shake while phone is shaking.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector;", "Landroid/hardware/SensorEventListener;", "listener", "Lcom/obss/textlogger/listener/ShakeDetector$Listener;", "(Lcom/obss/textlogger/listener/ShakeDetector$Listener;)V", "accelerationThreshold", "", "accelerometer", "Landroid/hardware/Sensor;", "lastTime", "", "queue", "Lcom/obss/textlogger/listener/ShakeDetector$SampleQueue;", "sensorManager", "Landroid/hardware/SensorManager;", "isAccelerating", "", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "", "sensor", "accuracy", "onSensorChanged", "setSensitivity", "start", "stop", "Companion", "Listener", "Sample", "SamplePool", "SampleQueue", "appTextLogger_debug"})
public final class ShakeDetector implements android.hardware.SensorEventListener {
    @org.jetbrains.annotations.NotNull()
    private final com.obss.textlogger.listener.ShakeDetector.Listener listener = null;
    private int accelerationThreshold = 11;
    private long lastTime = 0L;
    public static final int SENSITIVITY_LIGHT = 11;
    public static final int SENSITIVITY_MEDIUM = 13;
    public static final int SENSITIVITY_HARD = 15;
    private static final int DEFAULT_ACCELERATION_THRESHOLD = 11;
    @org.jetbrains.annotations.NotNull()
    private final com.obss.textlogger.listener.ShakeDetector.SampleQueue queue = null;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.SensorManager sensorManager;
    @org.jetbrains.annotations.Nullable()
    private android.hardware.Sensor accelerometer;
    @org.jetbrains.annotations.NotNull()
    public static final com.obss.textlogger.listener.ShakeDetector.Companion Companion = null;
    
    public ShakeDetector(@org.jetbrains.annotations.NotNull()
    com.obss.textlogger.listener.ShakeDetector.Listener listener) {
        super();
    }
    
    /**
     * This method is used for listening for shakes on devices with appropriate hardware.
     * @return true if the device supports shake detection.
     */
    public final boolean start(@org.jetbrains.annotations.NotNull()
    android.hardware.SensorManager sensorManager) {
        return false;
    }
    
    /**
     * This method is used to stop listening.
     * Ignored on devices without appropriate hardware.
     */
    public final void stop() {
    }
    
    /**
     * This method is used to stop listening.
     * Ignored on devices without appropriate hardware.
     */
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.SensorEvent event) {
    }
    
    /**
     * This method returns true if the device is currently accelerating.
     * @return magnitudeSquared to detect acceleration
     */
    private final boolean isAccelerating(android.hardware.SensorEvent event) {
        return false;
    }
    
    /**
     * This method sets the acceleration of threshold sensitivity.
     */
    public final void setSensitivity(int accelerationThreshold) {
    }
    
    /**
     * This method detects changes whether accuracy is changed.
     */
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$Companion;", "", "()V", "DEFAULT_ACCELERATION_THRESHOLD", "", "SENSITIVITY_HARD", "SENSITIVITY_LIGHT", "SENSITIVITY_MEDIUM", "appTextLogger_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * This interface listens for shakes, called on the main thread when the device is shaken.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$Listener;", "", "hearShake", "", "appTextLogger_debug"})
    public static abstract interface Listener {
        
        public abstract void hearShake();
    }
    
    /**
     * This class is An accelerometer shake sample.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$Sample;", "", "()V", "accelerating", "", "getAccelerating", "()Z", "setAccelerating", "(Z)V", "next", "getNext", "()Lcom/obss/textlogger/listener/ShakeDetector$Sample;", "setNext", "(Lcom/obss/textlogger/listener/ShakeDetector$Sample;)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "appTextLogger_debug"})
    public static final class Sample {
        private long timestamp = 0L;
        private boolean accelerating = false;
        @org.jetbrains.annotations.Nullable()
        private com.obss.textlogger.listener.ShakeDetector.Sample next;
        
        public Sample() {
            super();
        }
        
        public final long getTimestamp() {
            return 0L;
        }
        
        public final void setTimestamp(long p0) {
        }
        
        public final boolean getAccelerating() {
            return false;
        }
        
        public final void setAccelerating(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.obss.textlogger.listener.ShakeDetector.Sample getNext() {
            return null;
        }
        
        public final void setNext(@org.jetbrains.annotations.Nullable()
        com.obss.textlogger.listener.ShakeDetector.Sample p0) {
        }
    }
    
    /**
     * This class is used for pooling samples.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$SamplePool;", "", "()V", "head", "Lcom/obss/textlogger/listener/ShakeDetector$Sample;", "acquire", "release", "", "sample", "appTextLogger_debug"})
    public static final class SamplePool {
        @org.jetbrains.annotations.Nullable()
        private com.obss.textlogger.listener.ShakeDetector.Sample head;
        
        public SamplePool() {
            super();
        }
        
        /**
         * This method acquires a sample from the pool.
         * @return acquire samples.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.obss.textlogger.listener.ShakeDetector.Sample acquire() {
            return null;
        }
        
        /**
         * This method gives a sample to the pool.
         */
        public final void release(@org.jetbrains.annotations.NotNull()
        com.obss.textlogger.listener.ShakeDetector.Sample sample) {
        }
    }
    
    /**
     * This class defines queue of samples. Keeps a running average while shaking.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$SampleQueue;", "", "()V", "acceleratingCount", "", "isShaking", "", "()Z", "newest", "Lcom/obss/textlogger/listener/ShakeDetector$Sample;", "oldest", "pool", "Lcom/obss/textlogger/listener/ShakeDetector$SamplePool;", "sampleCount", "add", "", "timestamp", "", "accelerating", "asList", "", "clear", "purge", "cutoff", "Companion", "appTextLogger_debug"})
    public static final class SampleQueue {
        @org.jetbrains.annotations.NotNull()
        private final com.obss.textlogger.listener.ShakeDetector.SamplePool pool = null;
        @org.jetbrains.annotations.Nullable()
        private com.obss.textlogger.listener.ShakeDetector.Sample oldest;
        @org.jetbrains.annotations.Nullable()
        private com.obss.textlogger.listener.ShakeDetector.Sample newest;
        private int sampleCount = 0;
        private int acceleratingCount = 0;
        
        /**
         * Window size in ns. Used to compute the average.
         */
        private static final long MAX_WINDOW_SIZE = 500000000L;
        private static final long MIN_WINDOW_SIZE = 250000000L;
        private static final int MIN_QUEUE_SIZE = 4;
        @org.jetbrains.annotations.NotNull()
        public static final com.obss.textlogger.listener.ShakeDetector.SampleQueue.Companion Companion = null;
        
        public SampleQueue() {
            super();
        }
        
        /**
         * Adds a sample.
         * @param timestamp    in nanoseconds of sample
         * @param accelerating true if > [.accelerationThreshold].
         */
        public final void add(long timestamp, boolean accelerating) {
        }
        
        /**
         * Removes all shake samples from this queue.
         */
        public final void clear() {
        }
        
        /**
         * This method purges shake samples with timestamps older than cutoff.
         */
        public final void purge(long cutoff) {
        }
        
        /**
         * This method copies the shake samples into a list, with the oldest entry at index 0.
         * @return list of shake samples
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.obss.textlogger.listener.ShakeDetector.Sample> asList() {
            return null;
        }
        
        public final boolean isShaking() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/obss/textlogger/listener/ShakeDetector$SampleQueue$Companion;", "", "()V", "MAX_WINDOW_SIZE", "", "MIN_QUEUE_SIZE", "", "MIN_WINDOW_SIZE", "appTextLogger_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}