import React from 'react';
import './App.css';
// import * as PortOne from "https://cdn.portone.io/v2/browser-sdk.esm.js";
import * as PortOne from "@portone/browser-sdk/v2";
import config from './secret-config';
import axios from 'axios';

function App() {

  async function requestPayment() {
      try {
        const prepareResponse = await axios.get('http://localhost:8080/payments/prepare')
        
        const { storeId, channelKey } = prepareResponse.data

        const response = await PortOne.requestPayment({
          storeId: (storeId || 'default-value'),
          channelKey: (channelKey || 'default-value'),
          paymentId: `payment-${crypto.randomUUID()}`,
          orderName: "나이키 와플 트레이너 2 SD",
          totalAmount: 100,
          currency: "CURRENCY_KRW",
          payMethod: "CARD",
        });


      } catch (error) {
        console.error('Error fetching data:', error);
      }
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
