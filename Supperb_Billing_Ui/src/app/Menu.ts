
import { ContentChild } from '@angular/core';

export class Menu {
    public  static menu: Array<any> = [
        {
            admin: [

                { title: 'Transaction',
                submenu: [
                    {
                        title: 'Invoice History',
                    submenu: [
                        {
                            path: 'paid' , title: 'Paid'
                        },
                        {
                            path: 'notpaid' , title: 'Not Paid'
                        }
                    ]
                    },
                    {path: 'purchaseorderhistory', title: 'Purchase Order History'},
                    {path: 'supplies', title: 'Supplies'}
                ]
            },
              {
                title: 'Master',
                submenu:
                [ {
                     path: 'product', title: 'Product'
                 },
                 {
                     path: 'customer', title: 'Customer'
                 },
                 {
                    path: 'supplier', title: 'Supplier'
                },
                {
                    path: 'discount', title: 'Discount Rule'
                },
                {
                    path: 'category', title: 'Product Category'
                },
                {
                    path: 'ledger', title: 'Ledger'
                }

             ]

            },
            // {
            //     title: 'Target',
            //     submenu:
            //     [ {
            //          path: 'uploadtarget', title: 'UploadTarget'
            //      },
            //      {
            //          path: 'uploadtargetview', title: 'UploadTargetView'
            //      }
            //  ]

            // },
            {
                title: 'Report',
                submenu:
                [ {
                     path: 'productstockinhand', title: 'Product Stock In Hand'
                 },
                 {
                     path: 'salereport', title: 'Sale Report'
                 },
                 {
                     path: 'endofday', title: 'End Of Day'
                 },
                 {
                     path: 'purchasereport', title: 'Purchase Report'
                 },
                 {
                     path: 'productsalereport', title: 'Product Sale Report'
                 },
                 {
                     path: 'expencereport', title: 'Expence Report'
                 }
             ]

            }
            // {
            //     title: 'DamagedStock',
            //     submenu:
            //     [ {
            //          path: 'branchstockdamaged', title: 'BranchStockDamaged'
            //      },
            //      {
            //          path: 'customerstockdamaged', title: 'CustomerStockDamaged'
            //      }
            //  ]

            // // },
            // {
            //     title: 'Purchase Order',
            //     submenu:
            //     [ {
            //          path: 'editreceivingorder', title: 'EditReceivingOrder'
            //      },
            //      {
            //          path: 'branchtransfer', title: 'Branch Transfer'
            //      },
            //      {
            //          path: 'branchordertrasnfer', title: 'Branch Order Transfer'
            //      },
            //      {
            //          path: 'purchaseorder', title: 'PurchaseOrder'
            //      }
            //  ]

            // }
            ],
        }
    ];
    public static getallmenus() {
        return this.menu;
    }
}
