import React from 'react';
import './App.css';
// import * as PortOne from "https://cdn.portone.io/v2/browser-sdk.esm.js";
import * as PortOne from "@portone/browser-sdk/v2";
import config from './secret-config';

function App() {

  async function requestPayment() {

    const response = await PortOne.requestPayment({
      storeId: (process.env.REACT_APP_STORE_ID || 'default-value'),
      channelKey: (process.env.REACT_APP_CHANNEL_KEY || 'default-value'),
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
