var app_data = {};

var distributors =
{
    "distributors": [{
        "id": 251,
        "floorKey": 10017,
        "nodeName": "A000",
        "directFloorName": "DKNY",
        "directFloorKey": 123,
        "directAccountId": "5222263333",
        "accountId": "1222234444",
        "numCustomers": 5,
        "lastSeqChildNode": 12,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 300,
        "floorKey": 10030,
        "nodeName": "B000",
        "directFloorName": "DKN2",
        "directFloorKey": 124,
        "directAccountId": "5224263333",
        "accountId": "1222334444",
        "numCustomers": 15,
        "lastSeqChildNode": 22,
        "lastSeqChildInstitution": 2,
        "segmentsStatus": "RUNNING",
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 2500,
        "floorKey": 10283,
        "nodeName": "T000",
        "directFloorName": "KTMO",
        "directFloorKey": 125,
        "directAccountId": "5774231166",
        "accountId": "1371163364",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "LONDON"
    }, {
        "id": 1600,
        "floorKey": 10133,
        "nodeName": "4000",
        "directFloorName": "DKN3",
        "directFloorKey": 125,
        "directAccountId": "5224244433",
        "accountId": "1223566444",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 1650,
        "floorKey": 10148,
        "nodeName": "7000",
        "directFloorName": "DKN3",
        "directFloorKey": 125,
        "directAccountId": "5224266433",
        "accountId": "1223566664",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 2350,
        "floorKey": 10237,
        "nodeName": "P000",
        "directFloorName": "DKN3",
        "directFloorKey": 125,
        "directAccountId": "5224233433",
        "accountId": "1223563364",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 2401,
        "floorKey": 10253,
        "nodeName": "R000",
        "directFloorName": "DKN3",
        "directFloorKey": 125,
        "directAccountId": "5224233466",
        "accountId": "1333563364",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 2450,
        "floorKey": 10268,
        "nodeName": "S000",
        "directFloorName": "DKN3",
        "directFloorKey": 125,
        "directAccountId": "5774233466",
        "accountId": "1377563364",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 0,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }, {
        "id": 2650,
        "floorKey": 10300,
        "nodeName": "W000",
        "directFloorName": "KTOL",
        "directFloorKey": 125,
        "directAccountId": "5774878566",
        "accountId": "1371187854",
        "numCustomers": 5,
        "lastSeqChildNode": 14,
        "lastSeqChildInstitution": 11,
        "segmentsStatus": null,
        "active": true,
        "region": "NEW YORK"
    }]
};

var markupRulesByDistributorId =
{
    300: [{
        "id": 102,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "actual011111",
        "description": "rule with pairs01",
        "enabled": false,
        "active": true
    }, {
        "id": 200,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "actualmish",
        "description": "rule with pairs",
        "enabled": false,
        "active": true
    }, {
        "id": 401,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "mish04",
        "description": "mnish03",
        "enabled": false,
        "active": true
    }, {
        "id": 4,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "shai",
        "description": "DELETE RULE TEST",
        "enabled": false,
        "active": true
    }, {
        "id": 402,
        "distributerId": 300,
        "ruleType": "TRADER",
        "ruleName": "mish645",
        "description": "mish654",
        "enabled": true,
        "active": true
    }, {
        "id": 450,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "mish655",
        "description": "mish655",
        "enabled": false,
        "active": true
    }, {
        "id": 1050,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "Popa",
        "description": "aaaa",
        "enabled": true,
        "active": true
    }, {
        "id": 1051,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "Kopa",
        "description": "dddddffff",
        "enabled": true,
        "active": true
    }, {
        "id": 253,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "actualtttjjj",
        "description": "rule with pairs",
        "enabled": true,
        "active": true
    }, {
        "id": 600,
        "distributerId": 300,
        "ruleType": "ECOMM",
        "ruleName": "ggg",
        "description": "fdfdfd",
        "enabled": true,
        "active": true
    }, {
        "id": 653,
        "distributerId": 300,
        "ruleType": "TRADER",
        "ruleName": "EstherTrader",
        "description": "EstherTrader",
        "enabled": false,
        "active": true
    }, {
        "id": 701,
        "distributerId": 300,
        "ruleType": "TRADER",
        "ruleName": "Haim Rule",
        "description": "Testing",
        "enabled": true,
        "active": true
    }, {
        "id": 1000,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "TTT",
        "description": "aaaa",
        "enabled": true,
        "active": true
    }, {
        "id": 3,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "meyron",
        "description": "THIS IS A TEST RULE",
        "enabled": true,
        "active": true
    }, {
        "id": 850,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "R1",
        "description": "aaaa",
        "enabled": true,
        "active": true
    }, {
        "id": 300,
        "distributerId": 300,
        "ruleType": "ECOMM",
        "ruleName": "mishtest",
        "description": "desc02",
        "enabled": true,
        "active": true
    }, {
        "id": 900,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "TestRule1",
        "description": "aaaaallkklljjjj",
        "enabled": true,
        "active": true
    }, {
        "id": 950,
        "distributerId": 300,
        "ruleType": "SALES",
        "ruleName": "TT1",
        "description": "ssssddd",
        "enabled": true,
        "active": true
    }]
};

var subrulesByDistributorIdAndRuleId = {
    300: {
        102: [{
            "subRuleId": 3664,
            "ruleId": 102,
            "enabled": true,
            "productType": "SPOT",
            "seriesId": 196751,
            "seriesName": "AUD/USD",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": true
        }, {
            "subRuleId": 3665,
            "ruleId": 102,
            "enabled": true,
            "productType": "SWAP",
            "seriesId": null,
            "seriesName": "*",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3666,
            "ruleId": 102,
            "enabled": true,
            "productType": "SPOT",
            "seriesId": 1900677,
            "seriesName": "USD/CNH",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3667,
            "ruleId": 102,
            "enabled": true,
            "productType": "SPOT",
            "seriesId": 2228415,
            "seriesName": "EUR/PLN",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3668,
            "ruleId": 102,
            "enabled": true,
            "productType": "SWAP",
            "seriesId": 101,
            "seriesName": "EUR/USD",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3609,
            "ruleId": 102,
            "enabled": true,
            "productType": "NDF",
            "seriesId": null,
            "seriesName": "*",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3610,
            "ruleId": 102,
            "enabled": true,
            "productType": "NDF",
            "seriesId": 9633947,
            "seriesName": "USD/MYR",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3611,
            "ruleId": 102,
            "enabled": true,
            "productType": "NDF",
            "seriesId": 9633942,
            "seriesName": "USD/CNY",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3612,
            "ruleId": 102,
            "enabled": true,
            "productType": "NDF",
            "seriesId": 9633945,
            "seriesName": "USD/INR",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": false
        }, {
            "subRuleId": 3613,
            "ruleId": 102,
            "enabled": true,
            "productType": "NDF",
            "seriesId": 9633946,
            "seriesName": "USD/KRW",
            "active": true,
            "priceOrder": 1,
            "spread": null,
            "tenor": "*",
            "volume": "5",
            "minPnL": 8,
            "defaultSubRule": true
        }, {
            "subRuleId": 3614,
            "ruleId": 102,
            "enabled": true,
            "productType": "OUTRIGHT",
            "seriesId": null,
            "seriesName": "*",
            "active": true,
            "priceOrder": 1,
            "spread": 6000,
            "tenor": "*",
            "volume": "770000000000",
            "minPnL": 7000000,
            "defaultSubRule": false
        }, {
            "subRuleId": 3615,
            "ruleId": 102,
            "enabled": true,
            "productType": "OUTRIGHT",
            "seriesId": 201,
            "seriesName": "USD/JPY",
            "active": true,
            "priceOrder": 1,
            "spread": 4000,
            "tenor": "*",
            "volume": "500000000000",
            "minPnL": 30000,
            "defaultSubRule": true
        }]
    }
}

var tenors = {
    "forwards": [{
        "tenorSymbolUi": "TOD",
        "tenorId": 2,
        "tenorName": "TOD",
        "order": 10,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "TOM",
        "tenorId": 66,
        "tenorName": "TOM",
        "order": 20,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "TN",
        "tenorId": 130,
        "tenorName": "TOM Next",
        "order": 30,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "SN",
        "tenorId": 68,
        "tenorName": "Spot Next",
        "order": 50,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "1Wk",
        "tenorId": 70,
        "tenorName": "1 Week",
        "order": 60,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "2Wk",
        "tenorId": 134,
        "tenorName": "2 Weeks",
        "order": 70,
        "securityType": "OUTRIGHT"
    }, {
        "tenorSymbolUi": "1Mth",
        "tenorId": 72,
        "tenorName": "1 Month",
        "order": 90,
        "securityType": "OUTRIGHT"
    }, {"tenorSymbolUi": "IMM1", "tenorId": 78, "tenorName": "IMM1", "order": 200, "securityType": "OUTRIGHT"}],
    "swaps": [{
        "tenorSymbolUi": "O/N",
        "tenorId": 4325378,
        "tenorName": "O/N",
        "order": 10,
        "securityType": "SWAP"
    }, {
        "tenorSymbolUi": "T/N",
        "tenorId": 8519746,
        "tenorName": "TOM Next",
        "order": 20,
        "securityType": "SWAP"
    }, {
        "tenorSymbolUi": "S/N",
        "tenorId": 4456512,
        "tenorName": "Spot Next",
        "order": 30,
        "securityType": "SWAP"
    }, {
        "tenorSymbolUi": "1Wk",
        "tenorId": 4587584,
        "tenorName": "1 Week",
        "order": 40,
        "securityType": "SWAP"
    }, {
        "tenorSymbolUi": "1Mth",
        "tenorId": 4718656,
        "tenorName": "1 Month",
        "order": 70,
        "securityType": "SWAP"
    }, {"tenorSymbolUi": "IMM1", "tenorId": 5111872, "tenorName": "IMM1", "order": 180, "securityType": "SWAP"}]
};

var floors = {
	300: {
		customerFloorId: 300,
		traders: [
			{
				"customerId": 1,
				"viewer": "ddd",
				"trading": true,
				"emailAddress": "mish1@email.com",
				"enabled": true,
				"name": "rrr"
			},
			{
				"customerId": 2,
				"viewer": "bbb",
				"trading": true,
				"emailAddress": "mish2@email.com",
				"enabled": true,
				"name": "ssss"
			}
		]
	}
};

app_data.distributors = distributors;
app_data.markup_rules = markupRulesByDistributorId;
app_data.subrules = subrulesByDistributorIdAndRuleId;
app_data.tenors = tenors;
app_data.floors = floors

module.exports = app_data;