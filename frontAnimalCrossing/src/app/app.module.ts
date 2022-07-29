import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { RegisterComponent } from './components/register/register.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { HeaderComponent } from './components/header/header.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { MatIconModule } from '@angular/material/icon';
import { VillagersListComponent } from './components/villagers-list/villagers-list.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { ProfileComponent } from './components/profile/profile.component';
import { MenuComponent } from './components/menu/menu.component';
import { FishesListComponent } from './components/fishes-list/fishes-list.component';
import { BugsListComponent } from './components/bugs-list/bugs-list.component';
import { IslandLeaderComponent } from './components/island-leader/island-leader.component';
import { FishCatchedComponent } from './components/fish-catched/fish-catched.component';
import { BugCatchedComponent } from './components/bug-catched/bug-catched.component';
import { IslandComponent } from './components/island/island.component';
import {ToastModule} from 'primeng/toast';
import { MessageService } from 'primeng/api';
import {MatTableModule} from '@angular/material/table';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    NavBarComponent,
    RegisterComponent,
    HeaderComponent,
    NotFoundComponent,
    VillagersListComponent,
    ProfileComponent,
    MenuComponent,
    FishesListComponent,
    BugsListComponent,
    IslandLeaderComponent,
    FishCatchedComponent,
    BugCatchedComponent,
    IslandComponent

  ],
  imports: [
    RouterModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    MatIconModule,
    NgxPaginationModule,
    FormsModule,
    ToastModule,
    MatTableModule



  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
