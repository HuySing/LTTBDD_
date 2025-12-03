package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3.ui.theme.Lab3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WelcomeScreen()
                }
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp) // Tăng padding cho phù hợp với Pixel 8 Pro
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Surface(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp)), // Bo tròn nhiều hơn
                color = Color.DarkGray
            ) {
                Text(
                    text = "UI components",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    fontSize = 14.sp // Điều chỉnh cỡ chữ
                )
            }

            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = "Nguyễn Văn A",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp // Tăng cỡ chữ
                )
                Text(
                    text = "2342312323",
                    fontSize = 13.sp, // Tăng cỡ chữ
                    color = Color.Gray
                )
            }
        }

        // Main content - centered
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp), // Tăng padding ngang
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Jetpack Compose Logo",
                modifier = Modifier
                    .size(240.dp) // Tăng kích thước logo
                    .padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(28.dp)) // Tăng khoảng cách

            // Title
            Text(
                text = "Jetpack Compose",
                fontSize = 24.sp, // Tăng cỡ chữ
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(12.dp)) // Tăng khoảng cách

            // Description
            Text(
                text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                textAlign = TextAlign.Center,
                color = Color.DarkGray,
                fontSize = 16.sp, // Tăng cỡ chữ
                lineHeight = 24.sp, // Tăng khoảng cách dòng
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }

        // Button at bottom - điều chỉnh cho Pixel 8 Pro
        Button(
            onClick = { /* Không cần xử lý gì trong ví dụ này */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp) // Tăng chiều cao nút
                .padding(horizontal = 15.dp) // Thêm padding ngang
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            shape = RoundedCornerShape(28.dp), // Bo tròn nhiều hơn
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3)
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp, // Thêm hiệu ứng đổ bóng
                pressedElevation = 8.dp
            )
        ) {
            Text(
                text = "I'm ready",
                color = Color.White,
                fontSize = 16.sp, // Tăng cỡ chữ
                fontWeight = FontWeight.Medium // Thêm độ đậm
            )
        }
    }
}