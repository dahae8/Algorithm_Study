# 해당 날짜 폴더의 README.md 파일에 있는 문제 풀기 !!!
1. 자신 브랜치 만들기
2. 날짜 폴더 아래 자신의 이름 폴더 만들기
3. 자신의 코드 올리기
4. 오늘치 문제 풀이 끝나면 master로 merge 요청하기!!


# ✅ commit 규칙

commit 메세지: [문제 출처(플랫폼)] 문제번호_문제이름 / 걸린시간  
터미널에서 작성법

    git commit -m "[BOJ] 2557_Hello World / 1분"

플랫폼 작성법 통일:  
[BOJ] - 백준  
[PGS] - 프로그래머스  
[LTC] - 리트코드  
[CFS] - 코드포스  
[SEA] - 삼성SW Expert Academy  
[ETC] - 그외  


# ✅ master 브랜치의 변경 사항을 다른 브랜치로 가져오는 방법

1. master 브랜치로 이동합니다:
   
    ```
    git checkout master 
    ```   


1. 최신 변경 사항을 가져옵니다:
    ```
    git pull origin master
    ```
2. 자신의 브랜치로 전환합니다:
    ```
    git checkout 브랜치명
    ```
3. master 브랜치에서 가져온 변경 사항을 자신의 브랜치로 병합합니다:
    ```
    git merge master
    ```
4. 병합이 완료되면 변경 사항을 원격 저장소로 푸시합니다:
    ```
    git push origin 브랜치명
    ```