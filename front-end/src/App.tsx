import React from 'react';
import './App.css';
// import * as PortOne from "https://cdn.portone.io/v2/browser-sdk.esm.js";
import * as PortOne from "@portone/browser-sdk/v2";
// import { loadPaymentWidget, ANONYMOUS } from '@tosspayments/payment-widget-sdk'
import config from './config';

function App() {

  async function requestPayment() {

    const response = await PortOne.requestPayment({
      // Store ID 설정
      storeId: config.storeId,
      // 채널 키 설정
      channelKey: config.channelKey,
      paymentId: `payment-${crypto.randomUUID()}`,
      orderName: "나이키 와플 트레이너 2 SD",
      totalAmount: 100,
      currency: "CURRENCY_KRW",
      payMethod: "CARD",
    });
    }
    
  return (
    <div className="App">
      <header className="App-header">
        Hello
      </header>
      <hr />
      <nav>
        <input type="button" onClick={requestPayment} value='payment'></input>
      </nav>
      
    </div>
  );
}

export default App;
