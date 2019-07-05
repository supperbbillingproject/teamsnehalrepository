import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BrenchtobreanchtrensferComponent } from './brenchtobreanchtrensfer.component';

describe('BrenchtobreanchtrensferComponent', () => {
  let component: BrenchtobreanchtrensferComponent;
  let fixture: ComponentFixture<BrenchtobreanchtrensferComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BrenchtobreanchtrensferComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BrenchtobreanchtrensferComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
