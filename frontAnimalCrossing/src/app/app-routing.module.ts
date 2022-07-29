import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BugCatchedComponent } from './components/bug-catched/bug-catched.component';
import { BugsListComponent } from './components/bugs-list/bugs-list.component';
import { FishCatchedComponent } from './components/fish-catched/fish-catched.component';
import { FishesListComponent } from './components/fishes-list/fishes-list.component';
import { HomeComponent } from './components/home/home.component';
import { IslandLeaderComponent } from './components/island-leader/island-leader.component';
import { IslandComponent } from './components/island/island.component';
import { LoginComponent } from './components/login/login.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { ProfileComponent } from './components/profile/profile.component';
import { RegisterComponent } from './components/register/register.component';
import { VillagersListComponent } from './components/villagers-list/villagers-list.component';
import { AuthGuardService } from './service/auth-guard.service';

const routes: Routes = [
  {
    path: '',
    canActivate: [AuthGuardService],
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'profile',
    canActivate: [AuthGuardService],
    component: ProfileComponent
  },
  {
    path: 'villagers',
    canActivate: [AuthGuardService],
    component: VillagersListComponent
  },
  {
    path: 'fishes',
    canActivate: [AuthGuardService],
    component: FishesListComponent
  },
  {
    path: 'bugs',
    canActivate: [AuthGuardService],
    component: BugsListComponent
  },
  {
    path: 'island-leader',
    canActivate: [AuthGuardService],
    component: IslandLeaderComponent
  },
  {
    path: 'island',
    canActivate: [AuthGuardService],
    component: IslandComponent
  },
  {
    path: 'fish-catched',
    canActivate: [AuthGuardService],
    component: FishCatchedComponent
  },
  {
    path: 'bug-catched',
    canActivate: [AuthGuardService],
    component: BugCatchedComponent
  },
  {path: '**',
  canActivate: [AuthGuardService],
   component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
