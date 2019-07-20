import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from 'app/dashboard/dashboard.component';
import { FormsModule } from '@angular/forms';
import { MatRippleModule, MatFormFieldModule, MatInputModule, MatSelectModule, MatTooltipModule, MatButtonModule, MatToolbarModule, MatGridListModule, MatRadioModule, MatDatepickerModule, MatCheckboxModule, MatIconModule, MatNativeDateModule } from '@angular/material';
import { AppModule } from 'app/app.module';
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';
import { BrenchtobreanchtrensferComponent } from './brenchtobreanchtrensfer/brenchtobreanchtrensfer.component';
import { BrenchstockreciveComponent } from './brenchstockrecive/brenchstockrecive.component';
import { HttpClientModule } from '@angular/common/http';
const branchrouting: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'branchstockrecieve', component: BrenchstockreciveComponent }
]

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(branchrouting),
    FormsModule,
    MatButtonModule,
    MatRippleModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatTooltipModule,
    MatToolbarModule,
    MatGridListModule,
    MatRadioModule,
    MatDatepickerModule ,
    MatCheckboxModule,
    MatIconModule,
    MatNativeDateModule,
    MatTableModule,
    MatPaginatorModule,
    MatDatepickerModule,
    HttpClientModule

  ],
  declarations: [DashboardComponent, BrenchtobreanchtrensferComponent, BrenchstockreciveComponent]
})
export class BranchmanagerModule { }
