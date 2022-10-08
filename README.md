### 🦁 멋쟁이사자처럼 백엔드

# 🗓 공부 일정
- 2022-10-04 : Git + 알고리즘
  
- 2022-10-05 : Intellij Git 사용 + 자바란? + interface 의존성과 다형성을 통한 예제 문제

- 2022-10-06 : List/Set/Map + File(파일 입출력)

- 2022-10-07 : Project(대용량데이터처리)
  
<br />

# ⚙️ 기술 스택
<div>
  <img alt="Java" src ="https://img.shields.io/badge/Java-007396.svg?&style=for-the-badge&logo=Java&logoColor=white"/>
</div>

<br />

## ☁️ 대용량데이터처리 프로젝트(1)
### ➀ 목적
#### &nbsp;&nbsp; A지역에서 B지역으로 어느곳으로 이사를 많이 갔는지 횟수 구하기

### ➁ 진행 순서
#### &nbsp;&nbsp; 1. 인구이동관련 대용량 파일을 다운받음
#### &nbsp;&nbsp; 2. 추출한 값 저장할 파일 생성
#### &nbsp;&nbsp; 3. 대용량 파일을 읽음
#### &nbsp;&nbsp; 4. 파일을 읽는 방식은 1줄씩 마지막 데이터까지 읽음
#### &nbsp;&nbsp; 5. 원하는 데이터만 추출하기 위해 파싱작업(여러가지 데이터중 지역만 추출)
#### &nbsp;&nbsp; 6. 추출한 데이터 Mapping(현재 지역이 숫자로 되어 있기에 한글로 변경 ex. 11 -> "서울")
#### &nbsp;&nbsp; 7. Mapping 할때마다 횟수 카운트
#### &nbsp;&nbsp; 8. Mapping한 A,B 지역을 담은 데이터와 횟수 카운트를 Map에 저장[key:(A,B),value:(횟수)] 
#### &nbsp;&nbsp; 9. 새로 생성한 파일에 지역정보와 이사횟수 작성


