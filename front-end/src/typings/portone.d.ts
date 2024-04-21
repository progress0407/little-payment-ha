declare module 'https://cdn.portone.io/v2/browser-sdk.esm.js' {

  export function somePaymentFunction(): Promise<any>;
  // 여기에 필요한 다른 함수들을 추가하세요.

  export function requestPayment(request: any): Promise<any>;
}