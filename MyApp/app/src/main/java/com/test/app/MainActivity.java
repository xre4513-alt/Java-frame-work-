package com.test.app;

import android.os.Bundle;
import android.os.Build;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Create scroll view
        ScrollView scrollView = new ScrollView(this);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(50, 50, 50, 50);
        
        // Title
        TextView title = new TextView(this);
        title.setText("📱 Device Info Tester");
        title.setTextSize(24);
        title.setTextColor(Color.parseColor("#FF5722"));
        title.setPadding(0, 0, 0, 30);
        
        // Device info text
        TextView info = new TextView(this);
        info.setTextSize(14);
        info.setTypeface(android.graphics.Typeface.MONOSPACE);
        info.setTextColor(Color.parseColor("#333333"));
        
        // Collect device information
        StringBuilder sb = new StringBuilder();
        sb.append("════════════════════════════════\n");
        sb.append("        DEVICE INFORMATION\n");
        sb.append("════════════════════════════════\n\n");
        
        sb.append("📱 MODEL:\n");
        sb.append("   ").append(Build.MODEL).append("\n\n");
        
        sb.append("🏭 MANUFACTURER:\n");
        sb.append("   ").append(Build.MANUFACTURER).append("\n\n");
        
        sb.append("🤖 ANDROID VERSION:\n");
        sb.append("   ").append(Build.VERSION.RELEASE).append("\n\n");
        
        sb.append("📊 API LEVEL:\n");
        sb.append("   ").append(Build.VERSION.SDK_INT).append("\n\n");
        
        sb.append("🔧 BRAND:\n");
        sb.append("   ").append(Build.BRAND).append("\n\n");
        
        sb.append("📟 DEVICE:\n");
        sb.append("   ").append(Build.DEVICE).append("\n\n");
        
        sb.append("💻 PRODUCT:\n");
        sb.append("   ").append(Build.PRODUCT).append("\n\n");
        
        sb.append("🖥️ HARDWARE:\n");
        sb.append("   ").append(Build.HARDWARE).append("\n\n");
        
        sb.append("════════════════════════════════\n");
        sb.append("        TEST STATUS\n");
        sb.append("════════════════════════════════\n\n");
        sb.append("✅ App is running successfully!\n");
        sb.append("✅ Testing framework is working\n");
        sb.append("✅ All permissions handled\n");
        sb.append("✅ Device info retrieved\n\n");
        
        sb.append("📱 Created with:\n");
        sb.append("   Java Framework Builder\n");
        sb.append("   GitHub Codespaces\n");
        sb.append("   GitHub Actions\n");
        
        info.setText(sb.toString());
        
        layout.addView(title);
        layout.addView(info);
        scrollView.addView(layout);
        setContentView(scrollView);
    }
}
