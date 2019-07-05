import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BrenchstockreciveComponent } from './brenchstockrecive.component';

describe('BrenchstockreciveComponent', () => {
  let component: BrenchstockreciveComponent;
  let fixture: ComponentFixture<BrenchstockreciveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BrenchstockreciveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BrenchstockreciveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
