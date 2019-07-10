import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BranchorderdisplayComponent } from './branchorderdisplay.component';

describe('BranchorderdisplayComponent', () => {
  let component: BranchorderdisplayComponent;
  let fixture: ComponentFixture<BranchorderdisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BranchorderdisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BranchorderdisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
