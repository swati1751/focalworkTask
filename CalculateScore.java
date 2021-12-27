
    //below functon is find the total Scoer of each Word
    function CalaclateScore(data){
        let totalScoerOfEach=0;
        for (let i of data){
            if(Number(i)){
                totalScoerOfEach=totalScoerOfEach+4
            }
            else if(i.length>7){
                totalScoerOfEach=totalScoerOfEach+3
            }
            else if(i.length>=5){
                totalScoerOfEach=totalScoerOfEach+1
            }
        }
        return totalScoerOfEach
    }


    // below function is main function
    function CalcalateResponse(Response,CorrectAnswer){
        Response=Response.split(" ");
        CorrectAnswer=CorrectAnswer.split(" ");
        //below line is find Response string score
        let ResponseTotalScore=CalaclateScore(Response);
        //below line is find CorrectAnswer string scroe
        let CorrectAnswerTotalScore=CalaclateScore(CorrectAnswer);
        //below line is PercentageOfScore
        let PercentageOfScore=ResponseTotalScore/CorrectAnswerTotalScore*100
        return PercentageOfScore

    }

    let correctAnswer='There are twenty-four hours in a day, 30 days in a month, and 12 months in the calendar year.';
    let response='There are Twenty-Four hours in a day. A year has 14 months.';
    //below line is call the main functon
    let Percentage=CalcalateResponse(response,correctAnswer);

            console.log(`${Percentage.toFixed(1)}%`)

