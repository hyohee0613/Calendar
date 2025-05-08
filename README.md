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

