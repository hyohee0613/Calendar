# 일정관리 앱


### API 명세서

| 기능      | Method | URL                | request                                                            | response                                                                          | 상태코드        |
|---------|--------|--------------------|--------------------------------------------------------------------|-----------------------------------------------------------------------------------|-------------|
| 일정 등록   | POST   | /api/schedule      | {<br>"title" : "할일",<br>"name" : "작성자",<br>"password": "비밀번호"<br>} | {<br>"id" : "id값",<br>"title" : "할일",<br>"name" : "작성자",<br>"date": "작성/수정일"<br>} | 201 Created |
| 전체 일정조회 | GET    | /api/schedule      | {<br>"name" : "작성자",<br>"date": "작성/수정일"<br>}                      |                                                                                   | 200 OK      |
| 선택 일정조회 | GET    | /api/schedule/{id} | {<br>"id" : "id값",<br>}                                            | {<br>"title" : "할일",<br>"name" : "작성자",<br>"date": "작성/수정일"<br>}                  | 200 OK      |
| 선택 일정수정 | PUT    | /api/schedule/{id} | {<br>"id" : "id값",<br>"password" : "비밀번호",<br>}                    | {<br>"title" : "할일",<br>"name" : "작성자",<br>"date": "작성/수정일"<br>}                  | 200 OK      |
| 선택 일정삭제 | DELETE | /api/schedule/{id} | {<br>"id" : "id값",<br>"password" : "비밀번호",<br>}                    |                                                                                   | 200 OK      |

### request body
{<br>
"name" : "작성자",<br>
"date": "작성/수정일"<br>
}

### response body
{<br>
"id" : "id값",<br>
"title" : "할일",<br>
"name" : "작성자",<br>
"date": "작성/수정일"<br>
}

{<br>"id" : "id값",<br>"password" : "비밀번호",<br>}

