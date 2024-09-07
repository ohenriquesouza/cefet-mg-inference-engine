import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ConfigComponent } from './pages/config/config.component';
import { CreateComponent } from './pages/config/components/create/create.component';

export const routes: Routes = [

    {
        path: '',
        component: HomeComponent
    },
    
    {
        path: 'config',
        component:ConfigComponent
    },

    {
        path: 'create',
        component:CreateComponent
    }
];
