/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.streamthoughts.kafka.streams.examples.wordcount.topology.internal;

import java.util.Set;

/**
 * StopWords.
 */
public class StopWords {

    public static Set<String> ENGLISH_STOP_WORDS = Set.of(
        "about","a","above","after","again","against","all","am","an","and","any","are","aren't","as","at","be",
        "because","been","before","being","below","between","both","but","by","can't","cannot","could","couldn't",
        "did","didn't","do","does","doesn't","doing","don't","down","during","each","few","for","from","further",
        "had","hadn't","has","hasn't","have","haven't","having","he","he'd","he'll","he's","her","here","here's",
        "hers","herself","him","himself","his","how","how's","i","i'd","i'll","i'm","i've","if","in","into","is",
        "isn't","it","it's","its","itself","let's","me","more","most","mustn't","my","myself","no","nor","not",
        "of","off","on","once","only","or","other","ought","our","ours","ourselves","out","over","own","same",
        "shan't","she","she'd","she'll","she's","should","shouldn't","so","some","such","than","that","that's",
        "the","their","theirs","them","themselves","then","there","there's","these","they","they'd","they'll",
        "they're","they've","this","those","through","to","too","under","until","up","very","was","wasn't","we",
        "we'd","we'll","we're","we've","were","weren't","what","what's","when","when's","where","where's","which",
        "while","who","who's","whom","why","why's","with","won't","would","wouldn't","you","you'd","you'll",
        "you're","you've","your","yours","yourself","yourselves");
}
