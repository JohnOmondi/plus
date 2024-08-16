package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_DETAIL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_INTENT
import com.example.propertyplus.navigation.ROUT_LOGIN
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.lightblue


@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()

            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally)

    {

        Text(
            text ="PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,)

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.icon) ,
            contentDescription ="home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text ="Manage your property with ease",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,)
        Spacer(modifier = Modifier.height(30.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//main card
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp), colors = CardDefaults.cardColors(Color.Gray)
            ){
//row 1
                Row(modifier = Modifier.padding(30.dp)) {
//card
                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.home99),
                                    contentDescription = "home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable {
                                            navController.navigate(
                                                ROUT_HOME
                                            )
                                        }
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }


                    }
                    //end card
                    Spacer(modifier = Modifier.width(30.dp))

                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp),elevation = CardDefaults.cardElevation(40.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.login),
                                    contentDescription = "home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable {
                                            navController.navigate(
                                                ROUT_PROPERTY
                                            )
                                        }

                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text ="home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }
                    }
                    //end card

                }
               // end of row

                Row(modifier = Modifier.padding(30.dp)) {
//card
                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp),elevation = CardDefaults.cardElevation(40.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.setting),
                                    contentDescription = "home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ROUT_DETAIL) }

                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "settings",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }


                    }
                    //end card
                    Spacer(modifier = Modifier.width(30.dp))

                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp),elevation = CardDefaults.cardElevation(40.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.profile),
                                    contentDescription = "home",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable {
                                            navController.navigate(
                                                ROUT_INTENT
                                            )
                                        }

                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text ="home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }
                    }
                    //end card

                }
                // end of row

                Row(modifier = Modifier.padding(30.dp)) {
//card
                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon45),
                                    contentDescription = "add product",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(ADD_PRODUCTS_URL) }

                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }


                    }
                    //end card
                    Spacer(modifier = Modifier.width(30.dp))

                    Card(modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)) {

                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.signup),
                                    contentDescription = "view product",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { navController.navigate(VIEW_PRODUCTS_URL) }

                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text ="home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)
                        }
                    }
                    //end card

                }
                // end of row







            }
            //end of main card
        }














    }



































}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}




