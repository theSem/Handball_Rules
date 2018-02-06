/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    String rules = "Part 1. The Game\n" +
            "\n" +
            "Rule 1.1 Types of games. Four-wall handball may be played by two, three or four players. When played by two, it is called singles; when played by three, cutthroat (See Interpretation No.1); and when played by four, doubles.\n" +
            "Part 1, Rule 1.1: Interpretation No. 1: “Cutthroat” is not an official tournament game. It is a game devised for use in practice with three players. There are a number of ways to play cutthroat, and the rules for singles should apply to the player playing without a partner, just as the rules for doubles should apply to two players playing as a team.\n" +
            "Rule 1.2 Description. Handball is a competitive game in which either hand or either fist may be used to hit the ball.\n" +
            "Rule 1.3 Objective. The objective is to win each rally by serving or returning the ball so the opponent is unable to keep the ball in play. A rally is won when one player is unable to return the opponent’s shot to the front wall before it touches the floor twice, or when a player returns the ball so that it hits the floor before striking the front wall.\n" +
            "Rule 1.4 Points and outs. Points are scored by the serving side when it serves an ace (a serve which is untouched by the receiver’s hand) or wins a rally (except as provided by Rule 3.4.D.4.b, Late start.) When the serving side loses one rally in singles or two rallies in doubles, it loses the serve (except as provided by Rule 4.2.A, Server.) Losing the serve is called an “out.” \n" +
            "Rule 1.5 Game, match, tiebreaker. A match is won by the first side winning two games. The first two games of a match are played to 21 points. In the event each side wins a game, a tiebreaker is played to 11 points. (See Rule 4.1.A)\n" +
            "\n" +
            "Part 2. Courts and Equipment\n" +
            "\n" +
            "Rule 2.1 Courts. The specifications for the standard four-wall handball court are:\n" +
            "A. Dimensions. The court is 20 feet wide, 20 feet high and 40 feet long, with the back wall having a recommended minimum height of 14 feet.\n" +
            "B. Lines and zones. Handball courts shall be divided and marked on the floors with 2-inch wide lines. Recommended colors are white or red. The lines shall be marked as follows:\n" +
            "  1) Short line. The short line is parallel to the front and back walls. Its outside edge is 20 feet from the front wall.\n" +
            "  2) Service line. The service line is parallel to the short line and its outside edge is 5 feet in front of the outside edge of the short line.\n" +
            "  3) Service zone. The service zone is the area between the outer edges of the short and service lines.\n" +
            "  4) Service boxes. A service box is located at each end of the service zone by lines which have outside measurements of 18 inches from, and parallel to, each side wall.\n" +
            "  5) Receiver’s restraining lines. Five feet back of the outside edge of the short line, lines should be marked on the floor extending at least 6 inches from the side wall. These lines, parallel to the short line, may also be marked as a broken line extending from side wall to side wall. (See Rule 4. 4.A).\n" +
            "\n" +
            "Rule 2.2 Ball.\n" +
            "A.  Only USHA official balls shall be used in all USHA events.\n" +
            "B. Current Specifications.  USHA balls:\n" +
            "  1) Material. The material should be rubber or synthetic material.\n" +
            "  2) Color. Color is optional.\n" +
            "  3) Size. 1 and 7/8-inch diameter, with a variation of 1/32-inch, plus or minus.\n" +
            "  4) Weight. The ball shall be 61 grams, with a variation of 3 grams, plus or minus. White label and big balls can weigh less.  \n" +
            "  5) Rebound. Rebound from free fall, 70-inch drop to a hardwood floor is 48 to 52 inches at a temperature of 68 degrees F.\n" +
            "  6) Selection. A ball should be approved by the referee for use in each match in all tournaments. During a game the referee has the authority to change balls if he deems it necessary. Though it is the referee’s decision, he should honor requests when made by both sides or when he detects erratic bounces.\n" +
            "C.  Other specifications. A lighter and/or larger ball may be used for any division provided it is USHA approved and is specified on the entry blank.\n" +
            "\n" +
            "Rule 2.3 Gloves.\n" +
            "A. General. Gloves must be worn to keep the ball dry.\n" +
            "B. Style. The usual hitting surfaces of the glove must be light in color and made of a soft material or leather with wetness easily detected by visual inspection. The fingers may not be webbed, connected or removed.  Any gloves which provide an unfair advantage are not allowed, and must be replaced at the referee’s direction. \n" +
            "C. Foreign substances. No foreign substance, tape, or rubber bands shall be used on the fingers or on the palms on the outside of the gloves. Metal or hard substances may not be worn under the glove if, in the opinion of the referee, such creates an unfair advantage.\n" +
            "Part 2, Rule 2.3.C: Interpretation No. 2:  A player should be allowed to protect a bone bruise on the hand. If some kind of thin bandaging material is not sufficient, the player should be allowed to use a coin or some other type of hard material, so long as the referee does not believe it creates an unfair advantage, in which case the material would be disallowed. Any such protection must be worn under the glove and must be approved by the referee before play begins. \n" +
            "D. Wet Gloves. Gloves must be changed when they become sufficiently wet to moisten the ball. This is the referee’s decision. Gloves with holes that expose the skin may not be worn. It is the player’s responsibility to have an ample supply of dry gloves.\n" +
            "\n" +
            "Rule 2.4 Uniform.\n" +
            "A. General. All parts of the uniform, consisting of a shirt, shorts, socks and shoes, must be clean at the beginning of a match. Only customary handball attire, in the referee’s judgment, can be worn. Players may not play without shirts. Shirts must be full length, not cut off in the torso.\n" +
            "B. Color. Color is optional. Unusual patterns that affect the opposing player’s view of the ball or cause a distraction may not be worn.\n" +
            "C. Wet shirts. Referee may demand that a wet shirt be changed. Players must have an ample supply of dry shirts.\n" +
            "D. Lettering and graphics. Lettering or graphics in poor taste are not allowed.\n" +
            "E. Shoes. Shoes must have soles that do not mark or damage the floor.\n" +
            "F. Headband (sweatband). Players must have access to a headband. They will not be required to wear it unless the referee deems it necessary to help keep the floor from getting wet.\n" +
            "\n" +
            "Rule 2.5 Eye protection.\n" +
            "A. General. Recognizing that protective eye wear cannot guarantee 100% safety from eye injuries resulting from playing handball, protective eye wear designed for court sports must properly worn at all times on the court.  The USHA recommends that players select unaltered lensed eye wear, with specifications that meet or exceed either ASTM, ANSI or Snell standards.\n" +
            "B. Violations. Failure to wear appropriate protective eyewear properly will result in a technical (see Rule 4.9), and the player will be charged a timeout to secure eyewear. The second violation in the same match will result in a forfeit. \n" +
            "Part 2, Rule 2.5.B: Interpretation No. 3:  If the referee is doing a proper job, there should never be a technical called for failure to wear eye protection properly. If the referee sees that a player is about to serve and is not wearing eye protection, the referee should immediately stop the game and inform the player who is about to create the violation. The referee should not let a player play without eye protection in place. If the player refuses to abide by this rule, the match shall be forfeited. Sometimes, however, the referee may not notice the eye protection infraction until after a rally has begun. If this occurs, the referee should stop play immediately and call a technical against the player in violation. The referee should also inform the player that a second violation will result in the match being defaulted.\n" +
            "\n" +
            "Part 3. Officials and Officiating\n" +
            "\n" +
            "Rule 3.1 Tournament director. All tournaments shall be managed by a tournament director, who shall designate the officials. Whenever possible, the officials should include a chief of referees, a floor manager, match referees, and line judges.\n" +
            " A. Responsibilities. The tournament director is responsible for overseeing the entire tournament. The tournament director, or his/her delegated representative, shall be present at all times.\n" +
            "B. Rules briefing. The current official USHA rules as posted on the USHA web site will apply and be made available. Any modifications made by the tournament director must be approved by the USHA and stated on the entry form, and/or be available to all players at registration. It is also recommended that referee clinics be held before all USHA-sanctioned tournaments.\n" +
            "\n" +
            "Rule 3.2 Chief of referees. The chief of referees is in charge of assigning referees to all tournament matches.\n" +
            "\n" +
            "Rule 3.3 Removal of Officials. Any official may be removed from a match upon the agreement of both singles players or both doubles teams providing there is agreement by the chief of referees or the tournament director.  In the event that an official’s removal is requested by one player or team and not agreed to by the other, the chief of referees or the tournament director may accept or reject the request.  It is recommended that the match be observed before determining what, if any, action is to be taken.  If the request for change is not upheld, the player or team making the request shall be charged with a timeout.  If the player or team is out of timeouts, a technical shall be assessed. This is not applicable in the case where both singles players or both doubles teams are in agreement in the request for change.\n" +
            "\n" +
            "Rule 3.4 Referee.\n" +
            "A. Pre-match duties. The principal official for every match shall be the referee.  The referee’s authority regarding a match begins once the players are called to the court. Before each match begins, it shall be the duty of the referee to:\n" +
            "    1) Playability. Check on adequacy of preparation of the handball court with respect to playability.\n" +
            "    2) Equipment. Check on availability and suitability of all materials necessary for the match, such as handballs, towels, scorecards, pencils and a timepiece.\n" +
            "    3) Assisting officials. Check readiness and provide instructions to assisting officials.\n" +
            "    4) Court hinders. Explain court hinders, if any, to players. (See Rule 4.3.A and 4.7.A.1).\n" +
            "    5) Inspect gloves, uniforms and eye protection. Remind players to have an adequate supply of extra gloves and shirts, and access to headbands. Inspect compliance of gloves and hands with rules. Remind players that failure to wear eye protection properly will result in a technical, and a second violation in a forfeit.\n" +
            "    6) Start game. Introduce players, toss coin to determine order of serve and signal start of game.\n" +
            "    7) Time. The assigned referee should be present 15 minutes before match time.\n" +
            "    8) Two-minute warning. Give a two-minute warning before the match and before each game. \n" +
            "    9) Scoring. Announce the scores before each rally. (See Rule 4.1.E  and 3.8).\n" +
            "B. Decisions. The referee shall make all decisions with regard to the rules and the referee has the authority to change his/her call. Where line judges are used, the referee shall announce all final judgments. In the absence of line judges, if both players in singles or three out of four in a doubles match disagree with a call made by the referee, the referee should consider reversing his/her call.  The Chief of Referees and/or Tournament Director who has witnessed a violation of Rule 4.9 Technicals may enforce the application of the Technical (See Rule. 4.9 Technicals).\n" +
            "    1) Spectators. The referee shall have jurisdiction over the spectators, as well as the players, while the match is in progress. (See Rule 5.6)\n" +
            "C. Protests. Any decision involving a rules interpretation may be protested before the next serve. It will then be resolved by the chief of referees or tournament director. Judgment calls may not be protested. If the player’s protest is upheld, the proper ruling will be made. If the player’s protest is not upheld, the player shall be charged with a timeout. If the player is out of timeouts, a technical shall be charged against the player.\n" +
            "D. Forfeitures. A match may be forfeited by the referee when:\n" +
            "  1) Flagrant unsportsmanlike conduct. Any player refuses to abide by the referee’s decision or engages in flagrant unsportsmanlike conduct.\n" +
            "  2) Three technicals. A player or side receives three technicals in a match, or two technicals for failure to properly wear eye protection.\n" +
            "  3) Leaving the court. Any player leaves the court at a time not allowed by these rules without permission of the referee.\n" +
            "  4) Failure to report.\n" +
            "    a. No show. Any player for a singles match, or any team for a doubles match, fails to report to play.\n" +
            "    b. Late start penalty. If a player is not ready to play (or resume play) on time, the opponent shall be awarded one point. The opponent will then be awarded one additional point for each full minute of delay of game up to 10 minutes. The match shall then be forfeited. This applies to the start of the match, between-game timeouts, timeouts during a game and glove-change timeouts. Late start penalty points are not cumulative, and the match forfeiture provision shall be applicable only if the full 10-minute delay is consecutive. Players should stay within earshot of the referee to help prevent the delay-of-game penalty. It is the obligation of the players to be ready to resume play on time even if the referee fails to give time warnings. If the matches are on, or ahead of schedule, the players must be in the court warming up at least 10 minutes before the assigned match time to assure a prompt start. If the tournament schedule is running behind, the players must be dressed and ready to enter the court for a maximum 10-minute, in-court warm up. If a player shows up less than 10 minutes before the scheduled starting time, that player’s warm-up time will be reduced accordingly. The tournament director may permit a longer delay if circumstances warrant.\n" +
            "E. Forfeitures. A player or team may be forfeited by the tournament director or official in charge for failure to comply with the tournament or host facility’s rules while on the tournament premises, for failure to referee or for any other improper conduct on the tournament premises.\n" +
            "F. Other rulings. The referee shall rule on all matters not covered in the USHA Official Rules. However, the referee may be overruled by the chief of referees or tournament director, the latter of whom shall have final authority.\n" +
            "5) Player forfeiture. A match must be played in its entirety with both players/teams on the court (See Rule 3.4.D.4.b). Partial forfeits, such as any player forfeiting the second game and progressing directly to a tiebreaker, are not allowed. A forfeit of any part of a match shall result in the forfeit of the entire match.\n" +
            "\n" +
            "3.5 Players.\n" +
            "A. Player Code. The USHA rules of handball place a presumptive code of integrity and honesty on each player.  It is expected that players will always self-enforce violations not detectable by a referee.  Such instances would include, but are not limited to, double bounces, wrist balls, and to fairly represent injuries in the application of Rule 4.10.C.\n" +
            "\n" +
            "Rule 3.6 Line judges.\n" +
            "A. Line Judges. If possible, two line judges will be used in all matches, positioned at the most advantageous viewpoints. A line judge’s opinion is based on his/her agreement or disagreement with the referee’s call. If a line judge is uncertain, he/she should abstain from expressing an opinion.\n" +
            "B. Duties and responsibilities. Line judges are designated to help decide appealed calls. In the event of an appeal, and after a very brief explanation of the appeal by the referee, the line judges must indicate their opinions of the referee’s call. The signal to show agreement with the referee is arm extended with thumb up, disagreement is shown by thumb pointing down. The signal to show no opinion or that the line judge is unsure, or his/her view was blocked, is arm extended with an open hand and palm down. Line judges shall not signal until the referee acknowledges the appeal and asks for a ruling.\n" +
            "C. Result of response. If both line judges signal no opinion, the referee’s call stands. If both line judges disagree with the referee, the referee must reverse his/her ruling. If only one line judge disagrees with the referee’s call, the referee may let the call stand, reverse the call or call for a replay.\n" +
            "\n" +
            "Rule 3.7 Appeals.\n" +
            "A. Appealable calls. Any player may appeal a short or other service fault. Any player may also appeal receiving line violations. If the server appeals a short or other service fault, and the appeal is upheld, the server is awarded the serve over. If the server had one short, the call would cancel the previous fault call, and the server would be awarded two serves, because he/she was judged to have made a legal serve. If, in the opinion of the referee, the ball could not have been returned, a point shall be awarded the server. If the appeal is not upheld, the call would be two shorts, a side out.  If, on the first serve, the server appeals a non-call of a short or other service fault, and the appeal is upheld, the server is awarded a second serve. After the rally has ended, either player may appeal on a double-bounce call or non-call, kill shots called good, killshots called no good and court hinders. The outcome may result in a point being awarded, a side out, or a replay depending on the line judges’ opinions. If both line judges disagree with the referee’s call or non-call, the call is reversed or replayed. After the rally has ended, either player may also appeal faults, restraining line violations, and skip serves not called. If the appeal is upheld, the player is awarded the appropriate call. At no time may a player appeal a screen serve, hinder (other than court hinders), technicals or other discretionary calls.\n" +
            "B. How to appeal. A player must make appeals directly to the referee before the referee announces the score. The referee will then request the opinion of the line judges. The referee may also appeal to the line judges if he/she is uncertain of his/her own call, and may then maintain, reverse or nullify the call in question. A replay shall be called if the referee believes it is necessary in the interest of fairness.\n" +
            "\n" +
            "Rule 3.8 Scorer. The scorer, when utilized, shall keep a record of the progress of the game in the manner prescribed by the tournament director. As a minimum, the progress record shall include the order of serves, outs, points, and total points scored each inning by each server.\n" +
            "\n" +
            "Rule 3.9 Floor manager. The floor manager informs players of their court assignments and times.\n" +
            "\n" +
            "Part 4. Play Regulations.\n" +
            "\n" +
            "Rule 4.1 Serve.\n" +
            "A. Order. In singles, the player winning the toss of a coin serves first in the first game. The other player serves first in the second game. If a tiebreaker is necessary, the player who scored the higher total of points in the first two games serves first. If both players score an equal number of points in the first two games, another coin toss will be made to determine which player serves first.\n" +
            "    In doubles, the side winning the toss of a coin chooses to serve or receive in the first game. The other side shall choose for the second game. If a tiebreaker is necessary, the team scoring the higher total of points in the first two games shall choose. If both teams score an equal number of points in the first two games, another coin toss will be made to determine which team has the choice.\n" +
            "B. Start. Games are started by the referee announcing “play ball,” and then the score, “0 serves 0.”\n" +
            "C. Place. The server may serve from any place in the service zone. No part of either foot may touch the floor beyond the outer edge of either line of the service zone. The server must remain in the service zone until the served ball passes the short line. Violations are called “foot faults.” (See Rule 4.3.C.1)\n" +
            "D. Manner (Legal Serve). The server must come to a complete stop in the service zone before beginning the serve. The serve is begun by bouncing the ball to the floor in the service zone. The ball must be hit by the server’s hand or fist so that it contacts the front wall first and on the rebound contacts the floor behind the short line, either with or without touching one of the side walls. Refer to Rule 4.3.C & D.\n" +
            "E. Time. A serve may not be made until the referee has announced the score (See Rule 3.4.A.9). The referee shall call “point” or “side out” as soon as a rally ends. The receiver then has up to 10 seconds to assume a receiving position. When the receiver has assumed a receiving position or 10 seconds have elapsed, whichever occurs first, and the server has had reasonable time to get to his/her serving position, the referee shall announce the score and the server must serve (hit the ball) within 10 seconds. If the first serve results in a fault or screen, the referee shall give the receiver a reasonable time to take a receiving position and the server reasonable time to get to his/her serving position. The referee shall then announce “second serve” if the serve was a fault, or “first/second serve, one screen” if a screen, after which the server must serve within 10 seconds. \n" +
            "\n" +
            "Part 4, Rule 4.1.E: Interpretation No. 4:  After the rally is over, the referee should immediately call “point” or “sideout.” The receiver then has 10 seconds to assume his/her ready position, but the server should only have “reasonable time” to get set. The server should not be allowed to stall by slowly retrieving the ball. As soon as the receiver is “ready” and the server has had reasonable time to retrieve the ball, the referee should call the score, at which time the server has 10 seconds in which to hit the ball. If the receiver is in his/her ready position and the referee believes that the server is taking too much time retrieving the ball and assuming the serving position, the referee should call the score. The server will then have 10 seconds in which to serve. If the receiver is not in his/her ready position after 10 seconds have elapsed from the time the referee calls “point” or “sideout,” the referee should call the score and the server may serve immediately or may take up to 10 seconds, whether or not the receiver is ready.\n" +
            "\n" +
            "Rule 4.2 Doubles.\n" +
            "A. Server. At the beginning of each game in doubles, each side informs the referee of the order of service, which must be followed throughout the game. Only the first server on the first serving team may serve the first time up. This player must continue to serve first throughout the game. When the game’s first server is put out on his/her initial serve, the side is out. Thereafter, both players on each side shall serve until an out for each occurs. It is not necessary for the server to alternate serves to the opponents.\n" +
            "B. Partner’s position. On each serve, the server’s partner shall stand erect with his/her back to the nearer side wall and with both feet on the floor within the service box until the served ball passes the short line. Violations are called “foot faults.”\n" +
            "\n" +
            "Rule 4.3 Defective serves. There are four types of defective serves which result in the following:\n" +
            "A. Dead-ball serves. A dead-ball serve results in no penalty and the server is given another serve without canceling a prior defective serve. This occurs in the following situations:\n" +
            "  1) Court hinders. If a served ball takes an erratic bounce due to a court obstruction or wetness (before the serve has become a legal serve) a court hinder is called and the serve is replayed. (See Rule 3.4.A.4 )\n" +
            "  2) Broken ball. If the ball is determined to have broken before the serve has become a legal serve, an approved ball must be put into play and the serve shall be replayed. (See Rule 4.6.J) \n" +
            "B. Screen serves. A screen serve call stops play, and the server gets another serve. Two consecutive screen serves result in a “fault.”\n" +
            "  1) Screen balls. If, in the referee’s judgment, the ball passes so close to the server or the server’s partner that the receiver’s view of the ball is obstructed, a screen should be called. Also, if the served ball hits the server’s partner on the fly rebounding from the front wall or from the front wall and a side wall while the server’s partner is in a legal position within the service box, it shall be treated as a screen serve. It is also a screen when any otherwise legally served ball passes behind the server’s partner, between the partner and the nearer side wall.\n" +
            "\n" +
            "Part 4, Rule 4.3.B.(1): Interpretation No. 5\n" +
            "The receiver standing in the center of the rear court, two to four feet from the back wall, should have a clear view of the served ball as it rebounds from the front wall when it is approximately five feet in front of the service zone. This is a difficult call because there will be instances in which the receiver will be screened, but the ball has been hit so high that it is going to result in a back-wall setup and the receiver will have time to get into a good position to attempt his/her shot. The screen serve, like any other hinder, is based on interference affecting the play. In the case just mentioned, there is initial interference, but the receiver still has time to get into good position so that the momentary screen will not affect the play. In such a case, the referee should not make the call too quickly, but should watch the reaction of the receiver. If the referee feels that the receiver hesitates getting into position, a screen should be called. If, however, the receiver moves quickly and obviously is going to have time to get into good position for a back-wall shot, the screen should not be called. \n" +
            "   The receiver should be given the benefit of any doubt so long as his/her receiving position is in the center of the court. However, if the receiver positions himself/herself to one side of center or anticipates the serve is going to be hit to one side and moves in that direction too quickly, and the serve is hit to the opposite side, a screen should not be called. It is also important that the referee attempt to position himself/herself in the middle of the balcony whenever possible so that he/she will have the same angle of view as the receiver. The best answer to this dilemma is: When in doubt, call a screen.\n" +
            "\n" +
            "  2) Straddle balls. A legally served ball that travels between the legs of the server is an automatic screen.\n" +
            "C. Fault serves. The following serves are fault serves, and any two that are hit consecutively before a legal serve is executed result in an out:\n" +
            "  1) Foot fault.\n" +
            "     a) The server begins the service motion with one or both feet touching the floor outside the service zone (See Rule 4.1.C).\n" +
            "     b) The server‘s foot touches the floor outside the service zone before the served ball passes through the plane of the back edge of the short line.\n" +
            "     c) In doubles, when the server’s partner is not in the service box with both feet on the floor and his/her back to the nearer side wall from the time the serve is begun until the ball passes through the plane of the back edge of the short line.\n" +
            "  2) Short serve. Any serve that first hits the front wall and on the rebound hits the floor in front of, or on, the short line either with or without touching one side wall.\n" +
            "  3) Three-wall serve. Any serve that first hits the front wall and then hits any two other walls before hitting the floor.\n" +
            "  4) Ceiling serve. Any serve that hits the front wall first and then touches the ceiling.\n" +
            "  5) Long serve. Any serve that first hits the front wall and rebounds to the back wall before touching the floor.\n" +
            "  6) Out-of-court serve. Any serve that first strikes the front wall and then rebounds out of the court without touching the floor.\n" +
            "  7) Bouncing ball outside service zone. Any serve that is struck on a bounce that was made outside the service zone. (See Rule 4.1.D).\n" +
            "  8) Not hitting ball on first bounce from a single drop. (See Rule 4.1. D).\n" +
            "  9) Two consecutive screen serves. Two consecutive screen serves result in a fault. This is the only fault call that cannot be appealed.\n" +
            "  10) Not coming to a complete stop in the service zone before beginning the serve (See Rule 4.1D).\n" +
            "D. Out serves. Any of the following results in an out:\n" +
            "  1) Missed serve. Any attempt to hit the ball that results in a total miss, or in the ball touching any part of the server’s body other than the hitting hand.\n" +
            "  2) Non-front serve. Any served ball that does not strike the front wall first.\n" +
            "  3) Touched serve. Any served ball on the rebound from the front wall, before bouncing on the floor, that touches the server, or touches the server’s partner when both of the partner’s feet are not touching the floor inside the service box or when the partner is not standing erect with his/her back to the nearer side wall. This includes a serve that is intentionally caught. When the partner is hit by the serve when he/she is not in the legal position, the out serve penalty supersedes the partner’s foot fault.\n" +
            "Part 4, Rule 4.3.D.(3): Interpretation No. 6\n" +
            "Even though the foot fault occurs before the out serve, the out serve penalty takes precedence and shall be enforced. Another example: A server foot faults when contacting the ball and the ball does not hit the front wall first. Again, the out serve penalty should be enforced. For this reason, a referee should wait until after the ball is served to call a foot fault. In doubles, the server should not be called out if his/her partner intentionally catches the ball in self defense. However, if the server’s partner catches a served ball that otherwise would not have hit him/her, an out is the proper call.\n" +
            "\n" +
            "4) Two consecutive fault serves. (See Rule 4.3.B).\n" +
            "5) Crotch serve. Any serve that hits a crotch in the front wall is an out. All balls hitting the crotch of a wall and the floor shall be considered to have hit the floor first. A serve that rebounds on the fly from the front wall into the crotch of the back wall and the floor is a legal serve, as is a three-wall crotch serve.\n" +
            "6) Out-of-order serve. In doubles, when either partner serves out of order, the points scored by that server since the out of order serving commenced will be subtracted and an out serve will be called. If the second server serves out of order, the out serve will apply to the first server and the second server will resume serving. If the player designated as the first server serves out of order, a sideout will be called. \n" +
            "Part 4, Rule 4.3.D.(6): Interpretation No. 7\n" +
            "If the referee is doing a proper job, there should be no out-of-order serves. The referee should keep the players informed as to which player is the server. If the referee sees that a player is about to serve out of order, the referee should immediately stop the player from serving and inform the team as to which player should be the server. If, however, a player does serve out of order, the “out-of-order” rule shall apply.\n" +
            "\n" +
            "7) Service delay. The server fails to hit the ball within 10 seconds after the referee has announced the score.\n" +
            "\n" +
            "Rule 4.4 Return of Serve.\n" +
            "A. Receiving position. The receiver or receivers must stand at least five feet behind the short line, as indicated by the receiver’s restraining lines, until the ball is hit by the server. Any violation of this rule results in a point for the server. (See Rule 2.1.B.5).\n" +
            "B. Fly return. In making a fly return, or any other legal return, the receiver may hit the ball anytime after it passes completely through the plane of the back edge of the short line; however no part of his/her body may extend on or over the plane of the back edge of the short line until after contacting the ball. In doubles, this also applies to the receiver’s partner. A violation results in a point for the server. After contacting the ball, the receiver and his/her partner may step on or over the short line without penalty.\n" +
            "C. Legal return. After the ball is legally served, one of the players on the receiving side must strike the ball either on the fly or after the first bounce, and before the ball touches the floor the second time, to return the ball to the front wall either directly or after it has touched one or both side walls, the back wall, the ceiling, or any combination of those surfaces. A returned ball may not touch the floor before touching the front wall. A ball may be played off the back wall as well as the front wall, provided the ball does not touch the floor a second time. Failure to make a legal return results in a point for the server.\n" +
            "\n" +
            "Rule 4.5. Changes of serve. A server continues serving until he/she or his/her side makes an out. When the server or the side loses the serve, they become the receiver or receiving side, and the receiving side becomes the serving side; and so alternately in all subsequent services of the game. Outs are made by:\n" +
            "A. Out serve. The server makes an out serve under Rule 4.3.D.\n" +
            "B. Fault serves. The server makes two fault serves before executing a legal serve under Rule 4.3.C.\n" +
            "C. Hits partner. The server hits his/her partner with an attempted return.\n" +
            "D. Return failure. The server or his/her partner fails to keep the ball in play by returning it as required by Rule 4.4.C.\n" +
            "E. Avoidable hinder. The server or his/her partner commits an avoidable hinder (See Rule 4.8).\n" +
            "F. Second out. In doubles, the side is retired when both partners have been put out, except on the first serve of the game as provided in Rule 4.2.A.\n" +
            "\n" +
            "Rule 4.6 Rally. A rally is defined as when the ball is legally returned and kept in play after a legal serve is executed. Play during rallies must be in accord with the following rules:\n" +
            "A. One hand. Only the front or back of one hand may be used at any one time to return the ball. Using two hands together or any portion of the body other than the hand to hit a ball is an out.\n" +
            "B. Wrist ball. The use of any other part of the body to return the ball, including the wrist or arm above the player’s hand, is a violation, even though the wrist or arm may be covered by a glove.\n" +
            "C. One touch. In attempting returns, the ball may be touched only once by one player. In doubles, both partners may swing at the ball, but only one may actually hit it.\n" +
            "D. Failure to return. Any of the following constitutes a failure to make a legal return during the rally:\n" +
            "    1) The ball bounces on the floor twice before being hit.\n" +
            "    2) After contact, the ball fails to reach the front wall before touching the floor.\n" +
            "    3) The ball goes off a player’s hand or fist into the gallery, into any opening in a side wall, or ceiling.\n" +
            "    4) A ball that obviously did not have the velocity or direction to hit the front wall strikes an opponent.\n" +
            "    5) In doubles, a ball struck by one player hits that player’s partner.\n" +
            "    6) Committing an avoidable hinder (See Rule 4.8).\n" +
            "E. Effect of failure to return. Each violation results in an out or point. Any violation not detected by the referee must be called by the offending player (See Rule 3.5.A).\n" +
            "F. Return attempts.\n" +
            "    1) Singles. If a player swings at but misses the ball in play, the player may repeat attempts to return the ball until it touches the floor the second time.\n" +
            "    2) Doubles. Both players on a side are entitled to attempt to return the ball. If one player swings at but misses the ball, both he/she and his/her partner may make further attempts to return the ball until it touches the floor the second time.\n" +
            "  3) Hinders. In singles or doubles, if a player swings at but misses the ball in play, and, in his/her or his/her partner’s continuing attempt to play the ball before it touches the floor a second time, an opponent commits unavoidable interference, a hinder is called (See Rule 4.7).\n" +
            "G. Touching the ball. Except as provided in Rule 4.7.A.2, any touching of a ball before it touches the floor the second time by a player other than the one making a return is a point or out against the offending player.\n" +
            "H. Out-of-court ball. Any ball returned to the front wall that on the rebound or on the first bounce goes into the gallery or through any opening in a side wall is declared dead and the serve replayed.\n" +
            "  1) No return. Any ball not returned to the front wall that goes off a player’s hand or fist into the gallery or into any opening in a side wall shall be an out or point against the player thus failing to make the return.\n" +
            "I. Dry ball and gloves. Every effort must be made to keep the ball dry. Deliberately wetting the ball results in an out or point. The ball may be inspected by the referee at any time. If a player’s gloves are wet to the extent that they leave wet marks on the ball, the player must change to dry gloves on a referee’s timeout. This is strictly a referee’s judgment. If a player wishes to change to dry gloves, he/she must hold his/her gloves up to the referee and obtain the referee’s permission to change. He/she may not leave the court without the referee’s permission. Two minutes are allowed for glove changes. The referee should give a one-minute warning, but the player is still responsible to be back in the court and ready to play within two minutes.\n" +
            "J. Broken ball. If there is any suspicion that a ball has broken on the serve or during a rally, play continues until the end of the rally. An official or any player may request that the ball be examined by the referee. If the referee decides the ball is broken, an approved ball must be put into play and the point replayed. Once a succeeding serve is attempted, the previous rally stands. (See Rule 4.3.A.2) \n" +
            "\n" +
            "Part 4, Rule 4.6.J: Interpretation No. 8:\n" +
            "The ball does not have to be completely broken to warrant a replay. A ball that is starting to crack will often have an erratic bounce. The referee should call for a replay only if he/she determines that a ball has cracked sufficiently to cause an erratic bounce. If a player suspects a ball has cracked, he/she should immediately toss it to the referee for inspection. No player shall make any physical effort to determine if the ball is cracked or otherwise unplayable without the express consent of the referee. This is solely the referee’s responsibility and he/she will make the replay call if necessary. At the referee’s discretion, if a ball is found to be unplayable due to the unauthorized physical efforts of any player, it shall be deemed to have been made unplayable by that player’s actions and not during the rally, and the preceding rally shall not be replayed.\n" +
            "\n" +
            "K. Play stoppage. If a foreign object enters the court, or any other outside interference occurs, or if a player loses a shoe or other properly worn equipment, the referee shall stop the game if it interferes with the continuance of play or poses an immediate danger. However, safety permitting, one rally-ending attempt should be allowed (See Rule 4.8.H).\n" +
            "Part 4, Rule 4.6.K: Interpretation No. 9\n" +
            "In most cases, if a foreign object (such as a ball from an adjacent court) enters the court, the referee should immediately stop play and call a hinder because of the distraction and for safety reasons. However, it might happen that a player would lose a shoe, headband or even a glove. In these cases, the referee should allow the opposing player one opportunity to hit a rally-ending shot if all of the following conditions are met:\n" +
            "1. The referee believes the opposing player is in no danger of stepping on the lost object;\n" +
            "2. The opposing player does not appear to be distracted by the lost object;\n" +
            "3. And the opposing player apparently has an opportunity to hit an offensive, rally-ending shot.\n" +
            "If the player is allowed the one offensive shot, one of the following calls should be made immediately afterward: If the player skips the ball in, that player loses the rally. If the player hits a kill shot or pass shot that cannot be retrieved, that player should be awarded the rally. If the player who lost the equipment is able to retrieve the shot, a hinder should be called.\n" +
            "\n" +
            "L. Replays. Whenever a rally is replayed for any reason, the server is awarded two serves. All previous defective serves are voided. \n" +
            "\n" +
            "Rule 4.7 Dead-ball Hinders. Dead-ball hinders should be called when interference affects the play. (See Rule 4.6.F.3).\n" +
            " A. Situations.\n" +
            "   1) Court hinders. If, after the ball has been legally served, in the referee’s opinion, an erratic bounce is caused by a court obstruction or irregularity, a court hinder should be called. The player should not stop play at any time in anticipation of a call. Included in court hinders is the ball that hits a wet spot on the floor, walls or ceiling, causing it to skid. This is the referee’s call, not the player’s. \n" +
            "Part 4, Rule 4.7.A.(1): Interpretation No. 10\n" +
            "Balls that skid on wet walls or floors are court hinders, assuming that the player was in position to make a return had the ball bounced truly. However, a house rule may prevail for courts that tend to be very humid, frequently causing the ball to skid on the walls. In such circumstances, hinders should not be called for balls skidding on walls. The referee must inform the players before such a house rule will apply. Balls that skid on a wet floor will always be called hinders, regardless of the condition of the court, again assuming that the player was in position to make a return had the ball bounced truly.\n" +
            "\n" +
            "  2) Ball hits opponent. When a returned ball touches an opponent on the fly before hitting the front wall, and the shot obviously would not have reached the front wall on the fly, the player who is hit by the shot will be awarded the rally. If the ball had any chance of reaching the wall, or if there is any doubt in the official’s mind as to whether the ball would have reached the front wall, a dead-ball hinder will be called.\n" +
            "  3) Body contact. If body contact occurs and the referee believes it was sufficient to stop the rally, either to prevent injury or because the contact distracted or prevented a player from being able to make a reasonable return, a hinder will be called. Except for the offensive player stopping play during his/her back-swing, physical contact is not an automatic hinder. Any other time an offensive player may immediately stop play and call contact, however, this is not an automatic hinder and the player stops play at his/her own risk. It is the judgment of the referee as to whether the contact impeded the play.\n" +
            "  4) Screen ball. Any ball rebounding from the front wall so close to the body of a defensive player that it interferes with or prevents the offensive player from having a clear view of the ball. The referee should be careful not to make the screen call so quickly that it takes away an offensive advantage.\n" +
            "  5) Straddle ball. When a ball passes between the legs of a player on the side that just returned the ball, if there is no fair chance for the opposing player to see or return the ball. This is not automatic.\n" +
            "  6) Back-swing hinder. A player may not stop play, except on physical contact during his/her back-swing. He/she may immediately say “Contact” if he/she wants a contact hinder. If he/she elects to hit the ball, no contact call will be permitted. The defensive player may not stop play if contact occurs during his/her opponent’s back-swing.\n" +
            "  7) Safety holdup. Any player about to execute a return who believes he/she will strike his/her opponent with his/her hand, arm, or the ball may immediately stop play and request a dead-ball hinder. This call must be made immediately and is subject to approval by the referee. The referee must grant the hinder if he/she believes the holdup was reasonable and the player otherwise might have been able to return the shot. The referee might also call an avoidable hinder if warranted. \n" +
            "Part 4, Rule 4.7. A.7: Interpretation No. 11\n" +
            "This situation comes about when the offensive player finds himself/herself unable to execute a swing without immediately hitting the opponent with his/her hand, arm or the ball.  This rule is designed to increase the safety of all players and is not meant to create additional opportunities for players to stop play. Players who call for a safety hold-up and stop play may find the referee in disagreement, in which case the referee’s call prevails.\n" +
            "\n" +
            "  8) Other interference. Any other unavoidable interference that prevents a player from having a fair chance to see or return the ball.\n" +
            "\n" +
            "B. Yielding fair access. \n" +
            "While attempting to return the ball, the offensive player is entitled to fair access to see and return the ball. It is the duty of the defensive side that has just served or returned the ball to yield position so the offensive side will not be required to go around an opponent. In the judgment of the referee, however, the offensive player must make a reasonable effort to move toward the ball and have a reasonable chance to return the ball before a hinder is called. The referee should be liberal in calling hinders to discourage playing the ball in such a way that an opponent cannot see it or swing at it until it is too late. When a player attempts a killshot in front of himself/herself and his/her position interferes with his/her opponent’s attempt to retrieve the ball, the referee should give the benefit of any doubt as to whether the ball was retrievable to the defensive player. It is not a hinder when a player hinders his/her partner. \n" +
            "Part 4, Rule 4.7.B: Interpretation No. 12\n" +
            "If the ball is judged to be un-retrievable, a hinder should not be called no matter what kind of interference takes place. However, if the referee is in doubt, the benefit of that doubt should go to the player attempting to retrieve the ball and the hinder should be called.\n" +
            "\n" +
            "C. Doubles. Both players on a side are entitled to a fair and unobstructed chance at the ball. Either one could have been entitled to a hinder even though it naturally would be his/her partner’s ball and even though the partner may have attempted to play the ball and has already missed (not touched) it.\n" +
            "D. Effect. A hinder call stops the play and usually voids any situation that follows, such as the ball hitting a player who stopped playing because of the call. However, if, in the opinion of the referee, his/her call was not responsible for the player being hit by the ball, the referee may overrule the hinder call and declare either a point or sideout. The only hinders a player may call are specified in Rules 4.7 A. 6., and 4.7. A.7., and are subject to approval by the referee.\n" +
            "Whenever a dead-ball hinder is called, the rally is replayed and any previous fault on the server is voided.\n" +
            "\n" +
            "Rule 4.8 Avoidable hinders. An avoidable hinder results in an out or a point (See Rule 4.5.E), depending on whether the offender was serving or receiving. Player intent has no bearing on an avoidable call. An avoidable hinder should be called only when a hinder could have been avoided with reasonable effort.  Avoidable hinders are called when:\n" +
            "A. Failure to move. A player does not move sufficiently to allow his/her opponent his/her shot. This may include serves. \n" +
            "Part 4, Rule 4.8.A: Interpretation No. 13\n" +
            "The legal position a player can assume when the opponent is hitting the ball from behind that player is at an angle to the left or right side of the ball being hit, as long as that position is assumed before the opponent begins his/her stroke. A player must move out of the way of the opponent even though it may mean moving to an undesirable court position. It is no excuse that the player claims he/she did not know where the opponent was. He/she must move. This is also the case when a player gives the opponent a back wall setup. It is the obligation of the defensive player to look over his/her shoulder and, if necessary, move out of the way. A player cannot line up directly in front of the opponent’s shot on a straight path to the front wall, parallel to the side walls. If a player assumes such a position and there is a collision, or if the player is struck by the ball, the hinder is avoidable.\n" +
            "\n" +
            "B. Blocking. A player moves into a position that effects a block or crowds his/her opponent about to return the ball; or, in doubles, one partner creates a hinder by moving in front of an opponent as his/her partner is returning the ball. \n" +
            "Part 4, Rule 4.8 B: Interpretation No. 14\n" +
            "This call is just the opposite of the “failure to move” avoidable hinder. When a player “creates” a hinder by his/her movement, it is also avoidable. Sometimes a player, in the effort to get into a better court position, will cause contact with an opponent who is about to hit the ball, or a player will move in so close to an opponent who is hitting the ball as to cause a possibility of body contact. In either case, an avoidable hinder should be called. It is also an avoidable hinder if one player, just as his/her partner is hitting the ball, moves directly in front of an opponent creating a hinder.\n" +
            "\n" +
            "C. Moving into ball. A player moves into the path of and is struck by the ball just played by his/her opponent. \n" +
            "Part 4, Rule 4.8 C: Interpretation No. 15\n" +
            "This avoidable hinder may occur almost anywhere on the court, but it usually happens in two particular areas:\n" +
            "1. A player is hitting a back-wall shot and, just as he/she hits the ball, the opponent moves into the path of the ball and is struck by it. This is avoidable. In this case, the referee must use judgment and not call an avoidable if he/she feels the ball was “mis-hit” and that the defensive player was moving into a non-hindering position in which he/she would not have been hit if the ball had been hit truly.\n" +
            "2. A player has an offensive setup and the opponent is trapped close to a side wall. In the effort to get into a more favorable position, the defensive player moves into the path of the ball and is hit. This is avoidable.\n" +
            "\n" +
            "D. Pushing. A player forcibly pushes an opponent during a rally. \n" +
            "Part 4, Rule 4.8.D: Interpretation No. 16\n" +
            "This avoidable hinder may occur when a player pushes a player, no matter how slightly, who is about to hit the ball, or when a player forcefully pushes a player in the attempt to get into position for his/her shot. An accidental push of a slight nature by an offensive player should not be called avoidable.\n" +
            "\n" +
            "E. View obstruction. Moving across an opponent’s line of vision just before he/she strikes the ball. \n" +
            "Part 4, Rule 4.8.E: Interpretation No. 17\n" +
            "Generally, this type of avoidable hinder occurs after a player has hit the ball and finds himself/herself out of position or pinned against a side wall. In the effort to move into a better court position, he/she crosses the eventual path of the ball just before the ball reaches the opponent, thereby obstructing the opponent’s view of the ball.\n" +
            "\n" +
            "F. Distraction. Any avoidable distraction or intimidation that would interfere with the offensive player or team. \n" +
            "Part 4, Rule 4.8.F: Interpretation No. 18\n" +
            "This avoidable hinder should be called against a player who attempts to move in very close to an opponent in an attempt to cause a distraction. \n" +
            "\n" +
            "  1) Talking During the Rally.  Aside from appeals and rally ending calls, there is no need for talking during a rally except in doubles, when the team on the offense is allowed to briefly communicate which partner is to hit, or not to hit, the ball. \n" +
            "Part 4, Rule 4.8.F.1: Interpretation No. 19\n" +
            "In doubles, allowable “brief communication” shall be construed to be any reasonable variation of “yours,” “mine,” or “leave it,” consisting of very few syllables. \n" +
            "    Any other talking during the rally by any player frequently affects the play of the opponent(s). If the referee determines that such talking is a distraction, an avoidable hinder shall be assessed. In order to deter unnecessary conflict between opponents on this issue, referees should be liberal in assessing this avoidable hinder.\n" +
            "    Sometimes an offensive player may make a call that is otherwise reserved for the referee, such as “short serve” “out,” or “hinder.”  Play shall immediately be stopped and the referee shall consider this to be an appeal for concurrence.  If the appeal is upheld, the player’s call shall stand. Otherwise, the player shall be assessed an avoidable distraction hinder and lose the rally.\n" +
            "  Under no circumstances may a player say anything while an opponent is playing the ball.\n" +
            "\n" +
            "G. Stroke interference. Any positioning that would not allow the opponent to use a normal stroke. This especially applies to a player moving in too close and being hit by, or restricting the follow-through of, the player hitting the ball.\n" +
            "Part 4, Rule 4.8.G: Interpretation No. 20\n" +
            "A player hitting the ball is entitled to stroke the ball without being in danger of contacting an opponent during the stroke. The stroke includes the back-swing as well as the follow-through of the arm. If a player is contacted during any part of the stroke by the player hitting the ball, an avoidable hinder should be called, assuming the player who was hit could have avoided the interference with reasonable effort. This interference might not have affected the shot, but it doesn’t matter if the ball reaches the front wall or not. This avoidable hinder must be called for safety reasons. Playing too close can cause serious injury, and the referee should forfeit the offending player if this type of positioning continues.\n" +
            "\n" +
            "H. Improper equipment. The loss of any improperly worn equipment, or equipment not required on court, that interferes with the play or the safety of the players constitutes an avoidable hinder. \n" +
            "Part 4, Rule 4.8.H: Interpretation No. 21\n" +
            "Improperly worn equipment includes eye protection that requires some type of strap in order to stay on the head. Failure to wear such a strap could be considered improperly worn equipment. Gloves that are not snugly attached might also be improperly worn equipment. Equipment not required could be items such as a baseball cap or jewelry.\n" +
            "\n" +
            "Rule 4.9 Technicals. A technical is assessed for unsportsman-like conduct or for improperly wearing eye protection. If a referee issues a technical, one point shall be deducted from the offender’s score. The technical has no effect on service changes or sideouts. If the technical occurs between games or when the offender has no points, the result will be that the offender’s score will be a negative one. Three technicals in a match, or two for eye protection infractions, on a singles player or a doubles team will result in a forfeiture.\n" +
            "A. Types. Some examples of actions that may result in technicals are:\n" +
            "    1) Too frequent or excessive complaints made against the referee’s judgment.\n" +
            "    2) Abuse of appeal privileges.\n" +
            "    3) Profanity.\n" +
            "    4) Excessive arguing.\n" +
            "    5) Threat of any nature to opponent or referee.\n" +
            "    6) Excessive or hard striking, throwing or kicking of ball between rallies. \n" +
            "Part 4, Rule 4.9.A.(6): Interpretation No. 22\n" +
            "If the opponent is hit or narrowly missed by the ball, a technical should be called. On the other hand, if it is the first offense, and the opponent was in no danger of being hit, a technical warning should be issued.\n" +
            "    7) Failure to wear eye protection properly.\n" +
            "    8) Protests lost after all timeouts have been used.\n" +
            "    9) Anything considered to be unsportsmanlike behavior.\n" +
            "\n" +
            "B. Warnings. If a player’s behavior is not so severe as to warrant a technical, a technical warning may be issued without a point deduction and should be accompanied by a brief explanation of the reason for a warning. A technical warning may precede the penalty of a technical but is not necessary.\n" +
            "\n" +
            "Rule 4.10 TIMEOUTS\n" +
            "A. Timeouts. Any player may request a timeout, but not after the referee has announced the score, called “second serve” after a fault serve, or called “first/second serve, one screen” after a screen serve. Timeouts must not exceed one minute. Three timeouts are allowed each side per 21-point game. Two timeouts are allowed during an 11-point game. Timeouts may be called consecutively. Players may leave the court during a timeout.\n" +
            "B. Equipment timeout. At the discretion of the referee, equipment timeouts may be granted for shoes that come off during play, broken shoelaces, torn equipment, wet gloves, wet shirts, wet floor, or other reasons. Players are not charged for such timeouts, and two minutes is the maximum time allowed.\n" +
            "C. Injury. No timeout shall be charged to a player who is injured during the match. An injured player shall not be allowed more than a cumulative total of 15 minutes of injury timeout during a match. If the injured player is unable to resume play after a period totaling 15 minutes, the match may be awarded to the opponent. Preexisting conditions (including but not limited to injury and illness), fatigue or cramps do not warrant injury timeouts. For any injury, if the referee or tournament director determines the player cannot continue play the match may be terminated at that time, regardless of cumulative injury timeout minutes still available. (See Rule 3.4.B.2).\n" +
            "  1). Blood Borne Pathogen.  When a player is bleeding, or when blood is detected on the court or on a player, play must be stopped, the player must be removed from the court, and play cannot resume until:\n" +
            "    a)  the bleeding is stopped;\n" +
            "    b)  the open wound is covered with a dressing strong enough to withstand the demands of continued play;\n" +
            "    c)  any player whose uniform is soiled with blood changes the part of the uniform affected;\n" +
            "    d)  and any surface contaminated with blood is cleaned.  Cleaning, including disposal, shall be performed by the host facility.  The occurrence of bleeding, by itself, shall not constitute an injury for the purpose of application of the injury timeout provisions of this rule.\n" +
            "D. Between games. Five-minute rest periods are allowed between games. Players may leave the court.\n" +
            "\n" +
            "Part 5. USHA Tournaments\n" +
            "\n" +
            "Rule 5.1 Draws. If possible, the draw shall be made at least two days before the tournament begins. The seeding method shall be approved by the committee or tournament director.\n" +
            "\n" +
            "Rule 5.2 Scheduling.\n" +
            "A. Preliminary matches. Contestants entered in both singles and doubles may be required to play both events on the same day or night with little rest between matches. If possible, the schedule should provide a player at least one hour rest period between all matches.\n" +
            "B. Final matches. Where one or more players have reached the finals in both singles and doubles, it is recommended that the singles match be played first, and a rest period of not less than one hour be allowed between the finals in singles and doubles.\n" +
            "\n" +
            "Rule 5.3 Consolation matches. Each entrant should be entitled to participate in a minimum of two matches. Therefore, players who lose their first matches should have the opportunity to compete in a consolation bracket. In draws of fewer than seven players, a round-robin bracket may be offered. Consolation matches may be waived at the discretion of the tournament director, but this waiver should be in writing on the tournament application.\n" +
            "\n" +
            "Rule 5.4 Notice of matches. After the first round of matches, it is the responsibility of each player to check the posted schedule to determine the time and place of each subsequent match. If any change is made in the schedule after posting, it shall be the duty of the tournament director to notify affected players of the change.\n" +
            "\n" +
            "Rule 5.5 Tournament management. In all USHA-sanctioned tournaments, the tournament director and/or the national USHA official in attendance may decide on a change of courts before, during or after any tournament game if such a change will accommodate better spectator or player conditions.\n" +
            "\n" +
            "Rule 5.6 Tournament conduct. In all USHA-sanctioned tournaments, the referee is empowered to default a match if a player conducts himself/herself in a manner detrimental to the tournament or the game of handball. This includes the authority of the referee and/or tournament director to remove disruptive or abusive people, and to default a match if such individuals are not removed. Additionally, in all USHA-sanctioned tournaments, the tournament director is empowered to prohibit further participation, and/or to remove, anyone who conducts himself/herself in a manner detrimental to the event or the game of handball. \n" +
            "Interpretation No. 23.  Coaching is allowed, however, only in a manner consistent with the behavior expected of any other spectator. Any coaching is expressly prohibited from the time the referee announces the score to the time the rally ends, and is subject to the removal and default provisions of this rule.\n" +
            "\n" +
            "A.  Junior and collegiate players shall abide by the USHA Code of Conduct as it appears on the USHA web site, at www.ushandball.org.\n" +
            "\n" +
            "Rule 5.7 Regional and national tournaments.\n" +
            "A. Regional tournaments. Regional tournaments are to be held each season. A map defining the boundary lines of each region will be drawn and made available to USHA area commissioners.\n" +
            "  1) Residence. Players may play only in the regional tournament for the region in which they live, with one exception. If the site of a neighboring regional tournament is closer to a player’s city of residence than the site of the tournament in his/her own region, the player may choose to play in either the closest regional tournament or in the tournament for his/her own region. However, he/she may play in only one of the two.\n" +
            "B. Collegiates. The purpose of the USHA-sponsored collegiate competition is to give college players a chance to showcase their talents under ideal conditions, and to assist in the promotion of college handball. The Collegiate Eligibility Rules are printed in Handball magazine each year with the official entry blank.\n" +
            "C. Juniors. The purpose of the USHA Junior program is to promote a worthwhile competition on the local and national levels, and to stimulate an ideal introduction to the game. It is encouraged for Junior events to be held in conjunction with all USHA-sanctioned tournaments.\n" +
            "\n" +
            "Rule 5.8 Eligibility. All entrants in any USHA event must be current USHA members.\n" +
            "A.  Age group divisions. In any division designated by a minimum age (Seniors, Masters, etc), the entrant must reach the proper age on or before December 31 of the calendar year in which he/she participates. For example, a player who is 39 is allowed to enter the Masters (40-plus) if he/she turns 40 before December 31 of the year in which the tournament is scheduled. In any division designated by a maximum age (Juniors, Challengers, etc), the player cannot have passed the age of eligibility until the day after the scheduled end of the tournament. For example, a player entering the 15-and-under division cannot reach his/her 16th birthday until the day after the  tournament is scheduled to end.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        int[] colors = {R.color.rules_one,R.color.rules_two,R.color.rules_three,R.color.rules_four, R.color.rules_five };


        LinearLayout mainView = (LinearLayout) findViewById(R.id.mainView);

        Part[] parts =  splitByParts();
        for (int i = 0; i < parts.length; i++){
            TextView temp = new TextView(this);
            mainView.addView(temp);
            temp.setText(parts[i].getTitle());
            temp.setTextAppearance(R.style.CategoryStyle);
            temp.setBackgroundResource(colors[i]);
            temp.setGravity(Gravity.CENTER_VERTICAL);
            temp.setPadding(getResources().getDimensionPixelSize(R.dimen.list_padding),0,0,0);
            temp.setTextSize(getResources().getDimension(R.dimen.list_text_size));
            temp.setLayoutParams(new TableLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 0, 1));
        }



        /*colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this,ColorsActivity.class));
            }
        }); */


    }

    public Part[] splitByParts() {
        String[] ruleList = rules.split("\n"); //Split the string by new lines

        int ruleNum = 1; //Define a counter for which rule # to use

        Part[] parts = new Part[5]; //Create the base array to store the parts in

        StringBuilder sb = new StringBuilder(); //This is how we will construct the parts


        for (String rule:ruleList) {
            if (!rule.isEmpty()) {
                if (rule.contains("Part " + ruleNum + ".")) {
                    parts[ruleNum - 1] = new Part(rule.substring(8).replace(".",""), null);
                    if (!sb.toString().isEmpty()) parts[ruleNum - 2].addChild(sb.toString());
                    ruleNum++;
                    sb = new StringBuilder();
                } else if (Objects.equals(rule.substring(0, 4).toLowerCase().replace(" ", ""), "rule")) {
                    if (!sb.toString().isEmpty()) {
                        parts[ruleNum - 2].addChild(sb.toString());
                    }
                    sb = new StringBuilder().append(rule);
                } else {
                    sb.append(" ").append(rule);
                }
            }
        }
        parts[parts.length-1].addChild(sb.toString());
        createRule(parts[0].getRules().get(0));
        System.out.println(parts[0].getRules().get(0));

        return parts;
    }

    public Rule createRule(String rule){
        System.out.println(rule.substring(5,8));
        int temp = 0;
        int counter = 8;
        StringBuilder stringBuilder = new StringBuilder();
        while (temp != 2){
            rule.charAt(counter);
        }
        return null;
    }
}
