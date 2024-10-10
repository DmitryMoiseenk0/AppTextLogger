package com.obss.textlogger.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\r\u0010\u0016\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b\u0018J)\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000\u00a2\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0017H\u0014J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\f\u0010#\u001a\u00060\u0011j\u0002`\u0012H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/obss/textlogger/view/FilePreviewer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/obss/textlogger/databinding/FilePreviewerBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "stringBuilderDefault", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilderLog", "view", "Landroid/view/View;", "clearView", "", "clearView$appTextLogger_debug", "initFilePreviewer", "activity", "Landroid/app/Activity;", "filePathName", "", "initFilePreviewer$appTextLogger_debug", "onDetachedFromWindow", "saveDefaultFileDetails", "filePath", "Ljava/io/File;", "saveLog", "takeDeviceInformationDetails", "takeDevicePerformanceDetails", "appTextLogger_debug"})
public final class FilePreviewer extends androidx.constraintlayout.widget.ConstraintLayout {
    private com.obss.textlogger.databinding.FilePreviewerBinding binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.View view;
    private final android.view.LayoutInflater layoutInflater = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.StringBuilder stringBuilderLog;
    @org.jetbrains.annotations.NotNull()
    private java.lang.StringBuilder stringBuilderDefault;
    
    public FilePreviewer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public FilePreviewer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public FilePreviewer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void initFilePreviewer$appTextLogger_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String filePathName) {
    }
    
    public final void clearView$appTextLogger_debug() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    private final void saveDefaultFileDetails(java.io.File filePath, android.content.Context context) {
    }
    
    private final void takeDeviceInformationDetails(android.content.Context context) {
    }
    
    private final void takeDevicePerformanceDetails(android.content.Context context) {
    }
    
    private final java.lang.StringBuilder saveLog() {
        return null;
    }
}