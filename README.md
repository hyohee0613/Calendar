# 일정관리 앱


### API 명세서

| 기능      | Method | URL                | request                                                            | response                                                                               | 상태코드                                         |
|---------|--------|--------------------|--------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------|
| 일정 등록   | POST   | /api/schedule      | {<br>"title" : "할일",<br>"name" : "작성자",<br>"password": "비밀번호"<br>} | {<br>"id" : "id값",<br>"title" : "할일",<br>"name" : "작성자",<br>"updatedAt": "작성/수정일"<br>} | 정상 등록 201 Created<br>필드 값 누락 400 Bad Request |
| 전체 일정조회 | GET    | /api/schedule      | Query Parameter<br>?name=작성자&date=2025-05-08T14:30:00              | 전체 일정 목록                                                                               | 정상 조회 200 OK                                 |
| 선택 일정조회 | GET    | /api/schedule/{id} | Query Parameter<br>?name=작성자&date=2025-05-08T14:30:00              | {<br>"title" : "할일",<br>"name" : "작성자",<br>"updatedAt": "작성/수정일"<br>}                  | 정상 조회 200 OK<br>ID 없음 404 Not Found          |
| 선택 일정수정 | PUT    | /api/schedule/{id} | {<br>"id" : "id값",<br>"password" : "비밀번호",<br>}                    | {<br>"title" : "할일",<br>"name" : "작성자",<br>"updatedAt": "작성/수정일"<br>}                  | 정상 수정 200 OK<br>비번 불일치 401 Unauthorized      |
| 선택 일정삭제 | DELETE | /api/schedule/{id} | Query Parameter<br>?password=비밀번호                                  |                                                                                        | 정상 삭제 200 OK<br>비번 불일치 401 Unauthorized      |



### ERD
[ERD링크](https://lucid.app/lucidchart/8d9fdb83-8895-4015-a394-439f3c3702f1/edit?viewport_loc=-11%2C-11%2C1661%2C1029%2C0_0&invitationId=inv_3fc991c4-153f-43cc-836f-4323373f467b)


--------
## 흐름
1. **일정등록 POST** ("/api/schedule")<br>
   * 클라이언트 → JSON 데이터 전송<br>

   * ScheduleRequestDto ← JSON → DTO 변환<br>

   * ScheduleController<br>
     * @PostMapping 으로 POST 요청 처리 
     * requestDto.toEntity() 를 통해 Schedule 도메인 객체 생성 
     * 생성된 Schedule 객체를 서비스로 전달<br>

   * ScheduleService
     * createSchedule() 메서드에서 Schedule 객체를 처리
     * (현재는 저장 없이 그대로 반환하는 임시 구조)<br>

   * ScheduleResponseDto
     * Schedule 객체를 클라이언트 응답 형식에 맞게 변환<br>

   * 응답
     * ResponseEntity 로 201 Created 상태코드와 함께 반환


2. 전체일정조회 GET
3. 선택일정조회 GET
4. 선택일정수정 PUT
5. 선택일정삭제 DELETE