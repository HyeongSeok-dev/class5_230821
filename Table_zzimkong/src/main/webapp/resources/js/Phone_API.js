//$(function() {
//	
//	
//	$("#api").on("click",function() {
//	//휴대폰 본인인증하기=======================================
//		console.log("버튼함수작동");
//		
//		var IMP = window.IMP;
//		IMP.init("{imp22106057}");
//		
//		IMP.certification({
//			//pg:'PG사코드.{CPID}', //본인인증설정2개이상일경우 필수
//			merchant_uid: "ORD20180131-0000011",
//			popup : false
//			},function(rsp){ //callback
//			if(rsp.success){
//				alert("인증에 성공하였습니다.");
//				return flase;
//			}else{
//				alert("인증에 실패하였습니다.");
//				return true;
//			}
//		});
//		
//		//callbackDate전달
//		IMP.certification({
//			/*중략 */
//			}, function (rsp) {
//				if(rsp.success){
//				//제이쿼리로 http요청			
//				JQuery.ajax({
//					url: "", //서버의 인증 정보를 받는 endpoint
//					method: "POST",
//					headers: {"Content-Type": "appliction/json"},	
//					data: {imp_uid: rsp.imp_uid}				
//				}); //ajax
//				}else{
//					alert("인증에 실패하였습니다. " + rsp.error_msg);
//				}
//		});
//	
//
//		}); //버튼
//}); //jquery문 전체