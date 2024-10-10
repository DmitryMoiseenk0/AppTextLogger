package com.obss.textlogger;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ#\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/obss/textlogger/TextLogger;", "Lcom/obss/textlogger/listener/ShakeDetector$Listener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "controlViewAttached", "", "customSnackBar", "Lcom/obss/textlogger/view/CustomSnackBar;", "filePathName", "", "filePreviewer", "Lcom/obss/textlogger/view/FilePreviewer;", "lottieAnimationResource", "", "Ljava/lang/Integer;", "title", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hearShake", "", "init", "setSnackBarCustomization", "(Ljava/lang/String;Ljava/lang/Integer;)V", "appTextLogger_debug"})
public final class TextLogger implements com.obss.textlogger.listener.ShakeDetector.Listener {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private boolean controlViewAttached = false;
    private com.obss.textlogger.view.CustomSnackBar customSnackBar;
    private com.obss.textlogger.view.FilePreviewer filePreviewer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer lottieAnimationResource;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filePathName;
    private final android.view.View view = null;
    
    public TextLogger(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    public final void setSnackBarCustomization(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer lottieAnimationResource) {
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    java.lang.String filePathName) {
    }
    
    @java.lang.Override()
    public void hearShake() {
    }
}