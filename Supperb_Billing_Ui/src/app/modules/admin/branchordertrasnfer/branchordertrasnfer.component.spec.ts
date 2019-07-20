import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BranchordertrasnferComponent } from './branchordertrasnfer.component';

describe('BranchordertrasnferComponent', () => {
  let component: BranchordertrasnferComponent;
  let fixture: ComponentFixture<BranchordertrasnferComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BranchordertrasnferComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BranchordertrasnferComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
