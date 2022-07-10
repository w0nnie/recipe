recipe


# 프로젝트 특징

- 스프링부트를 기반으로 CRUD 기능이 포함된 웹서비스


## 개요

- 명칭 : recipe
- 개발 인원 : 1명
- 개발 기간 : 2022.06.15 ~ 2022. 07.05
- 주요 기능 : 전체 레시피 조회, 타입, 분류, 칼로리, 재료 별 조회
- 개발 언어 : thymeleaf, css, javascript, java 8
- 개발 환경 : springboot 2.6.7, jpa
- 데이터베이스 : mariadb
- 형상관리 툴 : git
- 간단 소개 : 레시피 조회 서비스

# 화면 설계

## 메인페이지

![레시피 메인 페이지](https://user-images.githubusercontent.com/87374274/178153642-5cfec79e-fdf4-413a-91df-bef4a90d474b.png)


1. 레시피 이름 검색시 한글자라도 포함되어있다면 조회된다.
2. 타입, 분류, 칼로리 등으로 조회된다.
3. 레시피명 클릭시 해당 레시피의 조리과정이 나타난다.
4. header 클릭시 해당 페이지로 이동한다.

### 재료페이지

![레시피 재료 페이지](https://user-images.githubusercontent.com/87374274/178153961-c8f74591-48d1-45a9-9fcf-14befb72b5ee.png)

1. 재료리스트 체크시 해당 재료가 포함된 레시피드리 정렬된다.
2. 레시피명 클릭시 해당 레시피의 조리과정이 나타난다.
3. header 클릭시 해당 페이지로 이동한다.

### 상세 레시피 조회 모달

![레시피 모달](https://user-images.githubusercontent.com/87374274/178154113-4c0a2150-08d2-49d4-a10d-1b01b0eb41cf.png)

1. 상세 레시피를 조회한다.

